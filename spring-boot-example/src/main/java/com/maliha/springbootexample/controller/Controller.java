package com.maliha.springbootexample.controller;

import com.maliha.springbootexample.records.GreetResponse;
import com.maliha.springbootexample.records.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @GetMapping("/")
    public String home(){
        return "<h1>Welcome</h1>";
    }
    @GetMapping("/greet")
    public String greet(){
        return "Hello";
    }
    @GetMapping("/greet/record")
    public GreetResponse greetResponse(){
        return new GreetResponse("Hello",List.of("Java ","Python","C++"),new Person("Person1", 30, 30000));
    }

}
