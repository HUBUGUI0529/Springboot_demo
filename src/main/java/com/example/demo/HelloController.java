package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/page") // 所有接口都以 /api 开头
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}

根据上面的代码，写一个测试类


