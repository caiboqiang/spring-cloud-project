package com.cai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrixDashboard
@ComponentScan("com.cai")
public class HystrixDashboardService5040Application {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardService5040Application.class, args);
    }

}
