package org.example.hackathon.controller;

import org.example.hackathon.domain.PostEntity;
import org.example.hackathon.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequestMapping("progreen/post")
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

    @GetMapping("")
    public String getPostInfo(Model model){
        List<PostEntity> posts = postService.getAllPosts();
        model.addAttribute("posts" , posts);

        return "progreen/post";
    }

}
