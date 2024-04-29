package com.hodor.apiauthentication.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    @PostMapping("/hello")
    public String hello() {
        return "Hello World - USER";
    }

    @PostMapping("/hello2")
    public String hello2() {
        return "Hello World - ADMIN";
    }
}
