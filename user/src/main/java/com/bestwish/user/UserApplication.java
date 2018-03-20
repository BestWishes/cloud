package com.bestwish.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableHystrixDashboard
@EnableHystrix
public class UserApplication {

    public static void main(String[] args) {

        SpringApplication.run(UserApplication.class, args);

    }

}
