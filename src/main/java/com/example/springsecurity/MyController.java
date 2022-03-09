package com.example.springsecurity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/")
    public String myMethod() {
        return "Hello, authenticated user!";
    }

    @RequestMapping("/admin")
    public String myMethod2() {
        return "Hello, ADMIN!";
    }
}
