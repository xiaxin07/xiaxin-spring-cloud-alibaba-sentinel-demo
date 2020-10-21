package com.xiaxin.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "server-user",fallback = UserFeignFallback.class,configuration = FeignConfiguration.class)
public interface UserFeign {
    @GetMapping(value = "/hello")
    String hello(@RequestParam("name") String name);
}

class FeignConfiguration {
    @Bean
    public UserFeignFallback userFeignFallback() {
        return new UserFeignFallback();
    }
}

class UserFeignFallback implements UserFeign {
    @Override
    public String hello(@RequestParam("name") String name) {
        return "echo fallback";
    }
}