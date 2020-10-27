package com.xiaxin.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import com.xiaxin.config.FlowService;
import com.xiaxin.entity.SysUser;
import com.xiaxin.mapper.UserMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    @SentinelResource(value = "sayHello", blockHandlerClass = {FlowService.class}, blockHandler = "blockHandler")
    public String sayHello(String name) {
        return "Hello, " + name;
    }

    @Transactional
    @GlobalTransactional
//    @SentinelResource(value = "addUser", blockHandlerClass = {FlowService.class}, blockHandler = "blockHandler")
    public String addUser(SysUser user) {
        userMapper.insert(user);
        return "addUser success";
    }
}
