package com.xiaxin.service;

import com.xiaxin.entity.OrderInfo;
import com.xiaxin.entity.SysUser;
import com.xiaxin.feign.UserFeign;
import com.xiaxin.mapper.OrderMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    UserFeign userFeign;

    @Transactional
    @GlobalTransactional
    public String createOrder(Integer age) {
        OrderInfo order = new OrderInfo().setAddress("address").setOrderNo("orderNo").setPhone("phone");
        orderMapper.insert(order);
        SysUser user = new SysUser().setPassword("password").setUserName("username");
        userFeign.andUser(user);
        int i = 1 / age;
        return "create order success";
    }
}
