package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author sunlei19
 * @create 2018/8/16
 */

@Configuration
public class TestConfig {

    @Autowired
    private TestProperties testProperties;


    @Bean
    public String getProperties() {
        StringBuffer propertyStr = new StringBuffer();
        if (testProperties != null) {
            propertyStr.append(testProperties.getId()).append(testProperties.getName()).append(testProperties.getProperty());
        }
        return propertyStr.toString();
    }
}
