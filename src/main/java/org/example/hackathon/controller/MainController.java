package org.example.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/progreen")
public class MainController {

    public MainController() {

    }

    @GetMapping("/index")
    public String index() {
        return "progreen/index";
    }

    @GetMapping("/post")
    public String post() {
        return "progreen/post";
    }



}
