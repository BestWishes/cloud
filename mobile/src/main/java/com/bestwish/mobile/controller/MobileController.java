package com.bestwish.mobile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mobile")
public class MobileController {

    @Value("${server.port}")
    String port;
    @Value("${testname}")
    String testname;

    @RequestMapping("/getPhone")
    public String getPhone(String name) {
        return name + " - port:" + port + " - testname:" + testname;
    }

}
