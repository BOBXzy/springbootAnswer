package com.example.answer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {
    @RequestMapping("/hello")
    public String hello(){
        return "hello answering!";
    }
    @RequestMapping(value = "sayhello", method = RequestMethod.GET)
    public String sayhello(){
        return "Hello SpringBoot !";
    }
}
