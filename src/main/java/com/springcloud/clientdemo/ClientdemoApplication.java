package com.springcloud.clientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientdemoApplication.class, args);
    }

}
