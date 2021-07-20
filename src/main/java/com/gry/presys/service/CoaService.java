package com.gry.presys.service;

import com.gry.presys.constants.CacheConstants;
import com.gry.presys.mapper.MasterDataMapper;
import com.gry.presys.model.COAResponse;
import com.gry.presys.repository.COARepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CoaService {

    private static final Logger log = LoggerFactory.getLogger(CoaService.class);

    @Autowired
    COARepository coaRepository;

    @Autowired
    MasterDataMapper masterDataMapper;

    @Cacheable(cacheNames = CacheConstants.CACHE_MASTER, key = "T(String).valueOf(#root.method.name)")
    public COAResponse getAllCoa() {
        log.info("Getting All Chart of Account");
        return masterDataMapper.mapCOAFromDB(coaRepository.findAll());
    }
}
