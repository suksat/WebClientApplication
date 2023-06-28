package com.example.demo9i.controller;

import com.example.demo9i.model.CompletionRequest;
import com.example.demo9i.model.CompletionResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public Mono<String> getCompletion(@RequestParam("promptString") String promptString) {
        CompletionRequest request = new CompletionRequest();
        request.setModel("text-davinci-003");
        request.setPrompt(promptString);
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
                .map(CompletionResponse::getText)
                .map(String::trim);
    }
}
/*

@Controller
@RequestMapping("/completions")
public class CompletionController {

    private final WebClient webClient;

    public CompletionController(WebClient webClient) {
        this.webClient = webClient;
    }

    @PostMapping
    @ResponseBody
    public String getCompletion(@RequestParam("promptString") String promptString) {
        CompletionRequest request = new CompletionRequest();
        request.setModel("text-davinci-003");
        request.setPrompt(promptString);
        request.setTemperature(1);
        request.setMax_tokens(256);
        request.setTop_p(1);
        request.setFrequency_penalty(0);
        request.setPresence_penalty(0);

        CompletionResponse completionResponse = webClient.post()
                .uri("https://api.openai.com/v1/completions")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(request)
                .retrieve()
                .bodyToMono(CompletionResponse.class)
                .block();

        return completionResponse != null ? completionResponse.getText() : null;
    }
}
*/

/*
Explanation:

I changed the class annotation from @RestController to @Controller.
Added @ResponseBody annotation to the getCompletion() method to indicate that
the return value should be used as the response body.
Changed the return type from Mono<String> to String for the getCompletion() method.
Used the .block() method to block to wait for the completion of the asynchronous Mono execution
and obtain the completion response synchronously.
Return the getText() value from the CompletionResponse object, or null if the response was null.
Now, the CompletionController class has the @Controller annotation,
and the getCompletion() method returns a String as the response body.
*/
