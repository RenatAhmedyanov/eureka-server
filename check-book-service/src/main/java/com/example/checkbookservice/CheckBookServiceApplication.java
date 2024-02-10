package com.example.checkbookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CheckBookServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CheckBookServiceApplication.class, args);
    }
}
