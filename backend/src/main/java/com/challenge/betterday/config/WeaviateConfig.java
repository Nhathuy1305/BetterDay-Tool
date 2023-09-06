package com.challenge.betterday.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WeaviateConfig {
    @Value("${weaviate.url}")
    private String weaviateUrl;

    @Value("${weaviate.api-key}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public WeaviateConfig() {
        this.restTemplate = new RestTemplate();
    }

    // Sau này add thêm
}