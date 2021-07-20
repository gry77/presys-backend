package com.gry.presys.mapper;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EntityMapper {

    @Autowired
    DozerBeanMapper dozerBeanMapper;
}
