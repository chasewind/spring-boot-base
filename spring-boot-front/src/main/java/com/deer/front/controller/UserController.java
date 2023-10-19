package com.deer.front.controller;

import com.deer.spi.remote.front.UserFrontRemoteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserFrontRemoteService userFrontRemoteService;


    @PostMapping("/frontLogin")
    public String backendLogin(){
        userFrontRemoteService.login();
        return "front ok";
    }
}
