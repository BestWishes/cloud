package com.bestwish.user.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "mobile", fallback = MobileServiceImpl.class)
public interface MobileService {

    @RequestMapping(value = "/mobile/getPhone")
    String getPhone(@RequestParam(value = "name") String name);

}
