package com.bestwish.mobile.Service;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    RestTemplate restTemplate;

    @Hystrix
    public String save() {

        return restTemplate.getForObject("http://userService/user/save", String.class);

    }

}
