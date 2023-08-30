package com.challenge.betterday.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class WeaviateProperties {
    private String baseUrl;
    private String username;
    private String password;
}
