package com.deer.demo.backend.controller;

import com.deer.spi.remote.backend.SysRemoteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sys")
public class SystemController {

    @Resource
    private SysRemoteService sysRemoteService;

    @PostMapping("/backendLogin")
    public String backendLogin(){
        sysRemoteService.getAccountInfoList();
        return "backend ok";
    }
}
