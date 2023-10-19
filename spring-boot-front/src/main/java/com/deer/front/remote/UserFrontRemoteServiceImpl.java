package com.deer.front.remote;

import com.deer.spi.model.Result;
import com.deer.spi.model.UserInfo;
import com.deer.spi.remote.biz.UserRemoteService;
import com.deer.spi.remote.front.UserFrontRemoteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserFrontRemoteServiceImpl implements UserFrontRemoteService {
    @Resource
    private UserRemoteService userRemoteService;

    @PostMapping("/login")
    @Override
    public Result<Boolean> login() {
        UserInfo userInfo= userRemoteService.getUserBasicInfo(100L);
        System.out.println("mock result: "+userInfo.getUserName());
        return Result.success(Boolean.TRUE);
    }
}
