package com.itlaowang.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author dengwen 2019-07-2019-07-04 13:56
 */
@Component
@ConfigurationProperties(prefix="app")
public class AppConfig {

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
