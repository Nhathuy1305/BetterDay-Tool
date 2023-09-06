package com.challenge.betterday.controller;

import com.challenge.betterday.model.Video;
import com.challenge.betterday.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videos")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @GetMapping
    public List<Video> getAllVideos() {
        return videoService.getAllVideos();
    }

    @PostMapping
    public Video createVideo(@RequestBody Video video) {
        return videoService.saveVideo(video);
    }

    // Add thêm sau này
}
