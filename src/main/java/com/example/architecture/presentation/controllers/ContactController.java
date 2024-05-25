package com.example.architecture.presentation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ContactController {
    @GetMapping("/contact")
    public String sayHello() {
        return "This is my contact api";
    }
}
