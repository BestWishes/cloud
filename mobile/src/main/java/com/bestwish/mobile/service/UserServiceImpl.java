package com.bestwish.mobile.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Value("${server.port}")
    private String port;

    @Override
    public String save() {
        return "熔断器生效!from mobile:" + port;
    }
}
