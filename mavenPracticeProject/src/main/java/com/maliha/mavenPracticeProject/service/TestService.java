package com.maliha.mavenPracticeProject.service;

import org.springframework.stereotype.Component;

@Component
public class TestService {
    public String getMessage() {
        return "<h1>Welcome</h1>";
    }
    public String getGreeting() {
        return "Hello";
    }
}
