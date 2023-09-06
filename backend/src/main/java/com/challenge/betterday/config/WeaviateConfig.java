package com.challenge.betterday.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.weaviate.client.WeaviateClient;
import io.weaviate.client.WeaviateClientFactory;

@Configuration
public class WeaviateConfig{

    @Value("${weaviate.baseUrl}")
    private String weaviateBaseUrl;

    @Value("${weaviate.username}")
    private String weaviateUsername;

    @Value("${weaviate.password}")
    private String weaviatePassword;

    @Bean
    public WeaviateClient weaviateClient() {
        // Create and configure a Weaviate client instance
        WeaviateClient weaviateClient = WeaviateClientFactory.getClient(weaviateBaseUrl);

        // Set authentication credentials (if required)
        weaviateClient.setAuthentication(weaviateUsername, weaviatePassword);

        return weaviateClient;
    }
}
