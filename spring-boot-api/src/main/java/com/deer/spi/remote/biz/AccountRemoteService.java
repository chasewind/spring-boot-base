package com.deer.spi.remote.biz;

import com.deer.spi.model.AccountInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "demo-biz", url = "${demo.micro-service.biz.address}")
public interface AccountRemoteService {

    @PostMapping("/account/getAccountBasicInfo")
    AccountInfo getAccountBasicInfo(@RequestParam("userId") Long userId);
}
