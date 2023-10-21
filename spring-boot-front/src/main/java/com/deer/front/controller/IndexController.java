package com.deer.front.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping ("/abc")
    public String index(){
        return "hello,front ok";
    }
}
