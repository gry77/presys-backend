package com.gry.presys.config;

import org.dozer.DozerBeanMapper;
import org.dozer.DozerBeanMapperSingletonWrapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public DozerBeanMapper dozerBeanMapper() {
        return (DozerBeanMapper) DozerBeanMapperSingletonWrapper.getInstance();
    }
}
