package com.maliha.mavenPracticeProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String home(){
        return "<h1>Welcome</h1>";
    }
    @GetMapping("/greet")
    public String greet(){
        return "Hello";
    }
}
