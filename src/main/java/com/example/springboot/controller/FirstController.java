package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username","soeun");
        return "greetings"; // greetings.mustache 파일로 반환값
    }
    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("username","soeun");
        return "goodbye"; // greetings.mustache 파일로 반환값
    }
}
