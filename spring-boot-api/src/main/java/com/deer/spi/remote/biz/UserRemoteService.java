package com.deer.spi.remote.biz;

import com.deer.spi.model.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "demo-biz", url = "${demo.micro-service.biz.address}")
public interface UserRemoteService {

    @PostMapping("/user/getUserBasicInfo")
    UserInfo getUserBasicInfo(@RequestParam("userId") Long userId);

}
