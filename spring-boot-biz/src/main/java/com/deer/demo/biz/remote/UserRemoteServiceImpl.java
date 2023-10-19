package com.deer.demo.biz.remote;

import com.deer.spi.model.UserInfo;
import com.deer.spi.remote.biz.UserRemoteService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRemoteServiceImpl implements UserRemoteService {
    @PostMapping("/getUserBasicInfo")
    @Override
    public UserInfo getUserBasicInfo(@RequestParam("userId")Long userId) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(userId);
        userInfo.setUserName(RandomStringUtils.randomAlphanumeric(9));
        return userInfo;
    }
}
