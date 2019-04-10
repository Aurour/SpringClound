package com.example.clounddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ClounddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClounddemoApplication.class, args);
    }

}
