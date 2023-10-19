package com.deer.demo.biz.remote;

import com.deer.spi.model.AccountInfo;
import com.deer.spi.remote.biz.AccountRemoteService;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountRemoteServiceImpl implements AccountRemoteService {

    @PostMapping("/getAccountBasicInfo")
    @Override
    public AccountInfo getAccountBasicInfo(@RequestParam("userId")Long userId) {
        AccountInfo accountInfo = new AccountInfo();
        accountInfo.setUserId(userId);
        accountInfo.setAccountId(RandomUtils.nextLong(100L,10000L));
        accountInfo.setAccountName(RandomStringUtils.randomAlphanumeric(12));
        return accountInfo;
    }
}
