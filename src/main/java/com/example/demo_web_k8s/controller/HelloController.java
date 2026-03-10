package com.example.demo_web_k8s.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "Hello DevOps CI/CD Pipeline";
    }
}
