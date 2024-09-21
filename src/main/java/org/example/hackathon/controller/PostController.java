package org.example.hackathon.controller;

import org.example.hackathon.service.PostService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService)
    {
        this.postService =postService;
    }

    @PostMapping("/upload")
    public void savePost(
            @RequestPart String postName,
            @RequestPart String postContent
    )
    {
        postService.savePost(postName,postContent);
    }
}
