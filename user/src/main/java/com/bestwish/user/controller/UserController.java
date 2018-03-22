package com.bestwish.user.controller;

import com.bestwish.user.entity.User;
import com.bestwish.user.repository.UserRepository;
import com.bestwish.user.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping(value = "/user")
public class UserController {

    @Value("${name}")
    private String name = "jjj";

    @Value("${server.port}")
    private String port;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MobileService mobileService;

    @RequestMapping(value = "/save")
    public String save(User user) {

        userRepository.save(user);

        return "success !" + name + ",port :" + port;

    }

    @RequestMapping(value = "/getPhone")
    public String getPhone(String name) {
        return mobileService.getPhone(name) + " from:" + port;
    }
}
