package com.xiaxin.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import com.xiaxin.config.FlowService;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @SentinelResource(value = "sayHello", blockHandlerClass = {FlowService.class}, blockHandler = "blockHandler")
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
