package com.dupeyrat.portfolio.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan(basePackages = "com.dupeyrat.portfolio.core")
@EnableMongoRepositories(basePackages = "com.dupeyrat.portfolio.core.provider")
@Slf4j
public class CoreModuleConfiguration {

    @PostConstruct
    public void postConstruct() {
        log.info("Module CORE loaded [OK]");
    }
}
