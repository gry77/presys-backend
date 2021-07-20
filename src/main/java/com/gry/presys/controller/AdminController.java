package com.gry.presys.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private static final Logger log = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    CacheManager cacheManager;

    @RequestMapping(method = RequestMethod.DELETE, value = "/cache/all")
    public ResponseEntity<String> clearAllCache() {

        for (final String cacheName : this.cacheManager.getCacheNames()) {
            log.info("Cache {} is going to be cleared", cacheName);
            final Cache cache = this.cacheManager.getCache(cacheName);
            if (null != cache) {
                cache.clear();
                log.info("Cache {} is cleared", cacheName);
            }
        }

        return ResponseEntity.ok("OK");
    }

}
