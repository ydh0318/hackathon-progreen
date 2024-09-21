package org.example.hackathon.controller;

import org.example.hackathon.domain.Post;
import org.example.hackathon.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/progreen/post")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("")
    public String post(Model model) {
        List<Post> posts = postService.getAllPosts();
        model.addAttribute("posts", posts);
        return "progreen/post";
    }

    // 게시글 등록 처리
    @PostMapping("/register")
    public String registerPost(@RequestParam String title,
                               @RequestParam String content) {
        postService.createPost(title, content);  // 새 게시글을 저장
        return "redirect:/progreen/post";    // 등록 후 게시판 목록으로 리다이렉트
    }
}




