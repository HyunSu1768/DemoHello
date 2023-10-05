package com.example.helloworldapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    Environment env;

    @GetMapping("/")
    public String main(){
        return "Test World!  " + env.getProperty("HOSTNAME");
    }
}
