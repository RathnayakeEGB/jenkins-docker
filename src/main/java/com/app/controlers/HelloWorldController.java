package com.app.controlers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class HelloWorldController {

    @GetMapping(value = "/hello")
    public String hello(){

        return "I'm Sri Lankan But We can not express my ideas about the current situation of sri lanka fuck off ";
    }
}
