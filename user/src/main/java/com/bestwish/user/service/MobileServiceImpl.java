package com.bestwish.user.service;

import org.springframework.stereotype.Service;

@Service
public class MobileServiceImpl implements MobileService {

    @Override
    public String getPhone(String name) {
        return "熔断器生效";
    }
}
