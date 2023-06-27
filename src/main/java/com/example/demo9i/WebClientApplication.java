package com.example.demo9i;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // @Configuration, @EnableAutoConfiguration, and @ComponentScan
public class WebClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebClientApplication.class, args);
    }
}
