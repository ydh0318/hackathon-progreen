package org.example.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/progreen")
public class MainController {
    public MainController() {

    }

    @GetMapping("/")
    public String register() {
        return "progreen/index";
    }


}
