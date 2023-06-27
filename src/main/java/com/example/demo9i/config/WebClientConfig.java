package com.example.demo9i.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration // class will provide bean definitions
public class WebClientConfig {

    @Bean
    public WebClient webClient() { // create, configure and then return a WebClient instance as a bean
        return WebClient.builder()
                .defaultHeader(HttpHeaders.AUTHORIZATION, "Bearer sk-N7SioaLxdgQFGNpGZfDnHT3BlbkFJWVMR2sqJDlaTTpGK7W5")
                .build();
    }
}
