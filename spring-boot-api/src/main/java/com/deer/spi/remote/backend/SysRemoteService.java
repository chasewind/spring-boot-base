package com.deer.spi.remote.backend;

import com.deer.spi.model.AccountInfo;
import com.deer.spi.model.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "demo-backend", url = "${demo.micro-service.backend.address}")
public interface SysRemoteService {

    @PostMapping("/sys/getAccountInfoList")
    Result<List<AccountInfo>> getAccountInfoList();
}
