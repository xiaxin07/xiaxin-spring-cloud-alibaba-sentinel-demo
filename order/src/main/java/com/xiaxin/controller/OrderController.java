package com.xiaxin.controller;

import com.xiaxin.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    UserFeign userFeign;

    @GetMapping(value = "/hello")
    public String apiHello(@RequestParam("name") String name) {
        return userFeign.hello(name);
    }


}