package com.example.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/home")
    public String demo(){
        return "/home";
    }
}
