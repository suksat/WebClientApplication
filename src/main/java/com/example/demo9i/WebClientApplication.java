package com.example.demo9i;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class WebClientApplication {

    public static void main(String[] args) {
//		SpringApplication.run(Demo9iApplication.class, args);
        WebClient webClient = WebClient.builder().baseUrl("https://api.openai.com/v1/completions").build();

        String bearerToken = "sk-Gtv820As86pXyERexMZyVT3BlbkFJcvjD3EnF8Hnqvi8oa59";
        String url = "https://api.openai.com/v1/completions";

        String model = "text-davinci-003";
        String prompt = "temperature of nagpur";
        int temperature = 1;
        int maxTokens = 256;
        float topP = 1;
        float frequencyPenalty = 0;
        float presencePenalty = 0;

        // Build the request body
        String requestBody = "{\n" +
                "  \"model\": \"" + model + "\",\n" +
                "  \"prompt\": \"" + prompt + "\",\n" +
                "  \"temperature\": " + temperature + ",\n" +
                "  \"max_tokens\": " + maxTokens + ",\n" +
                "  \"top_p\": " + topP + ",\n" +
                "  \"frequency_penalty\": " + frequencyPenalty + ",\n" +
                "  \"presence_penalty\": " + presencePenalty + "\n" +
                "}";

        String responseBody = webClient.post()
                .uri(url)
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + bearerToken)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(requestBody))
                .retrieve()
                .bodyToMono(String.class)
                .block();

        System.out.println(responseBody);
    }
}


