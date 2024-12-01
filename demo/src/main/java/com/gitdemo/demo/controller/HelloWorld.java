package com.gitdemo.demo.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
public class HelloWorld {
    @GetMapping("/enter")
    public ResponseEntity<String> helloWorld()
    {
        return new ResponseEntity<>("Hello world new branch", HttpStatusCode.valueOf(200));
    }
    @GetMapping("/add")
    public ResponseEntity<Integer> add(@RequestBody Integer [] num)
    {
        Integer sum=0;
        for (int i=0;i<num.length;i++)
        {
            sum=sum+num[i];
        }
        return new ResponseEntity<>(sum,HttpStatusCode.valueOf(200));
    }
}
