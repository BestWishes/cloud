package com.bestwish.mobile.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "user", fallback =UserServiceImpl.class)
public interface UserService {

    @RequestMapping(value = "/user/save")
    String save();
}
