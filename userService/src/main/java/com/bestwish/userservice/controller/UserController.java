package com.bestwish.userservice.controller;

import com.bestwish.userservice.entity.User;
import com.bestwish.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Value("${name}")
    private String name="jjj";

    @Value("${server.port}")
    private String port;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/save")
    public String save(User user) {

        userRepository.save(user);

        return "success !" + name+",port :"+port;

    }

}
