package com.bestwish.mobile.controller;

import com.bestwish.mobile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    @Value("${server.port}")
    private String  port;
    @Autowired
    UserService userService;

    @RequestMapping("/save")
    public Object saveUser() {

        return userService.save()+" mobile:"+port;
    }
}
