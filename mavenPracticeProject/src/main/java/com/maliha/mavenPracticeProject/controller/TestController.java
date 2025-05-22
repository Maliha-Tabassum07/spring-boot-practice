package com.maliha.mavenPracticeProject.controller;

import com.maliha.mavenPracticeProject.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;
    @GetMapping("/")
    public String home(){
        return testService.getMessage();
    }
    @GetMapping("/greet")
    public String greet(){
        return testService.getGreeting();
    }
}
