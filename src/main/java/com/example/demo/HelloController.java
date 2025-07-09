package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // 所有接口都以 /api 开头
public class HelloController {
    @GetMapping("/Hello")
    public String hello() {
        return "Hello Spring Boot";
    }
}