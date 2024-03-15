package com.maliha.springbootexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String home(){
        return "Welcome";
    }
    @GetMapping("/greet")
    public String greet(){
        return "Hello";
    }
}
