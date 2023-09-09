package com.challenge.betterday.controller;

import com.challenge.betterday.service.WeaviateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weaviate")
public class WeaviateController {
    
    @Autowired
    private WeaviateService weaviateService;
    
    @PostMapping("/create-class")
    public void createWeaviateClass(@RequestParam String className) {
        weaviateService.createVideoClass(className);
    }

    @PostMapping("/index-video")
    public void indexVideo(
            @RequestParam String className,
            @RequestParam String id,
            @RequestParam String title,
            @RequestParam String description) {
        weaviateService.indexVideo(className, id, title,description);
    }

    @GetMapping("/search-video")
    public String searchVideo(
            @RequestParam String className,
            @RequestParam String query) {
        return weaviateService.searchVideos(className, query);
    }
}
