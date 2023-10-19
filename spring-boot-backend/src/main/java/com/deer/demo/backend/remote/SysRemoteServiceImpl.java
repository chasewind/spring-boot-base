package com.deer.demo.backend.remote;

import com.deer.spi.model.AccountInfo;
import com.deer.spi.model.Result;
import com.deer.spi.remote.backend.SysRemoteService;
import com.deer.spi.remote.biz.AccountRemoteService;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/sys")
public class SysRemoteServiceImpl implements SysRemoteService {
    @Resource
    private AccountRemoteService accountRemoteService;

    @PostMapping("/getAccountInfoList")
    @Override
    public Result<List<AccountInfo>> getAccountInfoList() {

        int seed = RandomUtils.nextInt(3,6);
        List<AccountInfo> dataList = new ArrayList<>();
        for(int i=0;i<seed;i++){
            AccountInfo accountInfo=   accountRemoteService.getAccountBasicInfo(Long.valueOf(seed));
            dataList.add(accountInfo);
        }
        System.out.println("mock size: "+dataList.size());
        return Result.success(dataList);
    }
}
