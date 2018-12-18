package com.example.servicefeign2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceFeign2Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeign2Application.class, args);
    }

}

