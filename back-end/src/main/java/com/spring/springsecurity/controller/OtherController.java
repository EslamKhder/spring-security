package com.spring.springsecurity.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("other")
public class OtherController {

    @PostMapping("/start")
    public String start(){
        return "write what you see?";
    }
}
