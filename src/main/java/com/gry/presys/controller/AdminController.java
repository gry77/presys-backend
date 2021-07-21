package com.gry.presys.controller;

import com.gry.presys.constants.MessageConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cache")
public class AdminController {

    private static final Logger log = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    CacheManager cacheManager;

    @GetMapping
    public String home() {
        return MessageConstants.NOTHING_HERE;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<String> clearAllCache() {

        for (final String cacheName : this.cacheManager.getCacheNames()) {
            log.debug("Cache {} is going to be cleared", cacheName);
            final var cache = this.cacheManager.getCache(cacheName);
            if (null != cache) {
                cache.clear();
                log.debug("Cache {} is cleared", cacheName);
            }
        }

        return ResponseEntity.ok("Cache cleared!");
    }

}
