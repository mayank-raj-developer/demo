package com.gitdemo.demo.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
public class HelloWorld {
    @GetMapping("/enter")
    public ResponseEntity<String> helloWorld()
    {
        return new ResponseEntity<>("Hello world", HttpStatusCode.valueOf(200));
    }
}
