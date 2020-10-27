package com.xiaxin.controller;

import com.xiaxin.feign.UserFeign;
import com.xiaxin.service.OrderService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    UserFeign userFeign;

    @Autowired
    OrderService orderService;

    @GetMapping(value = "/hello")
    public String apiHello(@RequestParam("name") String name) {
        return userFeign.hello(name);
    }

    @PostMapping(value = "/createOrder")
    public String addUser(@RequestParam("age") Integer age) {
        return orderService.createOrder(age);
    }


}