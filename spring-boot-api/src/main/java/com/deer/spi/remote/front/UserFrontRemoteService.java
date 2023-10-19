package com.deer.spi.remote.front;

import com.deer.spi.model.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "demo-front", url = "${demo.micro-service.front.address}")
public interface UserFrontRemoteService {

    @PostMapping("/user/login")
    Result<Boolean> login();
}
