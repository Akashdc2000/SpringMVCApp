package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HelloController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to Spring MVC with Tomcat 10.1.6!");
        return "home";
    }

    @GetMapping("/first")
    public String first(Model model) {
        model.addAttribute("message", "This is the FIRST controller mapping!");
        return "home";
    }
}
