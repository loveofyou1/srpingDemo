package com.example.demo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author sunlei19
 * @create 2018/8/16
 */
@Data
@ConfigurationProperties(prefix = "demo")
@Component
public class TestProperties {
    private String id;

    private String name;

    private String property;

}
