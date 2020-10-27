package com.xiaxin.controller;

import com.xiaxin.entity.SysUser;
import com.xiaxin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/hello")
    public String apiHello(@RequestParam("name") String name) {
        return userService.sayHello(name);
    }

    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody SysUser user) {
        return userService.addUser(user);
    }
}