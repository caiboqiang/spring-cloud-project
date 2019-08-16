package com.cai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //TODO 表明它是Eureka服务注册中心
public class EurekaService5010Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaService5010Application.class, args);
    }

}
