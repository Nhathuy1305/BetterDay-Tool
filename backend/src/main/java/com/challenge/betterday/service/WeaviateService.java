package com.challenge.betterday.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeaviateService {

    @Value("${weaviate.url}")
    private String weaviateUrl;

    @Value("${weaviate.token}")
    private String weaviateToken;

    private final RestTemplate restTemplate;

    public WeaviateService() {
        this.restTemplate = new RestTemplate();
    }

    // Create a class in Weaviate for video indexing (requires admin access)
    public void createVideoClass(String className) {
        String schemaUrl = weaviateUrl + "/v1/schema";
        // Create a JSON payload for creating the class
        String jsonPayload = "{\"class\": \"" + className + "\"}";

        restTemplate.postForObject(schemaUrl, jsonPayload, String.class);
    }

    // Index a video in Weaviate
    public void indexVideo(String className, String id, String title, String description) {
        String addObjectUrl = weaviateUrl + "/v1/objects";

        // Create a JSON payload for indexing the video
        String jsonPayload = "{"
                + "\"class\": \"" + className + "\","
                + "\"id\": \"" + id + "\","
                + "\"properties\": {"
                + "\"title\": \"" + title + "\","
                + "\"description\": \"" + description + "\""
                + "}"
                + "}";

        restTemplate.postForObject(addObjectUrl, jsonPayload, String.class);
    }

    // Perform a semantic search in Weaviate
    public String searchVideos(String className, String query) {
        String searchUrl = weaviateUrl + "/v1/graphql";

        String graphQLQuery = "{"
                + "\"query\": \"query {"
                + "search {"
                + "Video {"
                + "search (certainty: 0.9) {"
                + "id,"
                + "title,"
                + "description"
                + "}"
                + "}"
                + "}\""
                + "}";

        String jsonPayload = "{\"query\": \"" + graphQLQuery + "\"}";

        return restTemplate.postForObject(searchUrl, jsonPayload, String.class);
    }
}