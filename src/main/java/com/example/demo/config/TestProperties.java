package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author sunlei19
 * @create 2018/8/16
 */
@Component
@ConfigurationProperties(prefix = "demo")
public class TestProperties {
    @Value(value = "1")
    private String id;

    @Value(value = "hello")
    private String name;

    @Value(value = "properties")
    private String property;


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getProperty() {
        return property;
    }


    public void setProperty(String property) {
        this.property = property;
    }
}
