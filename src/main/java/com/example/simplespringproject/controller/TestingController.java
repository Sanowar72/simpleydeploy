package com.example.simplespringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestingController {
    @GetMapping()
    public String home(){
        return "this is home for testing";
    }
}
