package com.example.demo9i.controller;

import com.example.demo9i.model.CompletionRequest;
import com.example.demo9i.model.CompletionResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/completions")
public class CompletionController {

    private final WebClient webClient;

    public CompletionController(WebClient webClient) {
        this.webClient = webClient;
    }

    @PostMapping
    public Mono<String> getCompletion() {
        CompletionRequest request = new CompletionRequest();
        request.setModel("text-davinci-003");
        request.setPrompt("temperature of Nagpur as on today");
        request.setTemperature(1);
        request.setMax_tokens(256);
        request.setTop_p(1);
        request.setFrequency_penalty(0);
        request.setPresence_penalty(0);

        return webClient.post()
                .uri("https://api.openai.com/v1/completions")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(request)
                .retrieve()
                .bodyToMono(CompletionResponse.class)
                .map(CompletionResponse::getText);
    }
}
