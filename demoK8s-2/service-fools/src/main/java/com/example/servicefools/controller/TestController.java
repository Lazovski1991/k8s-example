package com.example.servicefools.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping
    public String getText() {
        return "Hello fools";
    }
}
