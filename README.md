# ChatGPT Spring Boot program v4

ChatGPT Spring Boot program v4 deals with sending POST request to 
```https://api.openai.com/v1/completions``` 

# Spring Boot WebClient Example

This is a Spring Boot application that demonstrates how to use the `WebClient` from `org.springframework.web.reactive.function.client` to send a POST request with Bearer Token authorization and receive a JSON response from the OpenAI API.

## Installation

To run the project, you need to have Java 8 or higher installed on your system. You can follow these steps to install and run the project:

1. Clone the repository to your local machine:

   ```
   git clone https://github.com/suksat/WebClientApplication.git
   ```

2. Navigate to the project directory and checkout to latest version of git:

   ```
   cd WebClientApplication
   git checkout v4
   ```
3. Get your Open AI key:

```
https://platform.openai.com/account/api-keys
```

4. Build the project using Maven:

   ```
   ./mvnw clean install
   ```

5. Run the application:

   ```
   ./mvnw spring-boot:run
   ```

   This will start the Spring Boot application on a local server.

## Usage

Once the application is running, you can use the following API endpoint to make a completion request:

```
POST localhost:8080/completions?promptString=Nagpur temperature chart
```

Request Body (JSON) will be automatically attached to above POST request:

```json
{
  "model": "text-davinci-003",
  "prompt": "promptString",
  "temperature": 1,
  "max_tokens": 256,
  "top_p": 1,
  "frequency_penalty": 0,
  "presence_penalty": 0
}
```

The response will contain the generated completion text.

## Configuration

The project contains a `WebClientConfig` class that provides a configured instance of the `WebClient` to be used for making HTTP requests. It sets the default authorization header with the bearer token.

## Project Structure

The project follows a standard Maven project structure with the following main packages:

- `com.example.demo9i.config`: Contains the configuration classes for the application.
- `com.example.demo9i.controller`: Contains the REST controller class for handling completion requests.
- `com.example.demo9i.model`: Contains the model classes used for request and response mapping.
- `com.example.demo9i`: Contains the main application class.

## Dependencies

The project uses the following dependencies:

- spring-boot-starter-web https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web

- spring-boot-starter-webflux https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-webflux

- spring-boot-starter-reactor-netty https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-reactor-netty

- jackson-databind https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind

These dependencies are managed automatically by the Spring Boot parent POM.




## Code Flow

1. The application starts by running the `WebClientApplication` class, which is the entry point of the Spring Boot application.

2. The `WebClientConfig` class is a Spring configuration class that sets up the `WebClient` bean with the necessary Bearer Token authorization.

3. The `CompletionController` class is a Spring MVC controller that handles the POST request to `/completions` endpoint. It uses the `WebClient` bean to send the request to the OpenAI API.

4. The `CompletionRequest` class represents the JSON request payload that will be sent to the OpenAI API. It contains the necessary parameters such as the model, prompt, temperature, max_tokens, top_p, frequency_penalty, and presence_penalty.

5. The `CompletionResponse` class represents the JSON response received from the OpenAI API. It contains properties such as id, object, created, model, choices, and usage.

6. When the `/completions` endpoint is invoked, the `getCompletion()` method in the `CompletionController` class is executed.

7. Inside the `getCompletion()` method, a new instance of `CompletionRequest` is created with the required parameters.

8. The `WebClient` sends a POST request to the specified URL (`https://api.openai.com/v1/completions`) with the JSON payload containing the `CompletionRequest`.

9. The response from the OpenAI API is deserialized into an instance of `CompletionResponse` using the `bodyToMono()` method of `WebClient`.

10. The deserialized `CompletionResponse` object is returned as the response of the `/completions` endpoint.

## Expected Output

The expected output from the OpenAI API, based on the provided example JSON response, would be:

```
The temperature in Nagpur varies greatly depending on the season. Below is a chart showing the average temperatures in Nagpur during different seasons:

Season	Avg. Temp (°C)
Winter	15-25
Spring	25-35
Summer	35-45
Monsoon	25-35
Autumn	25-35
```

This output represents the completion generated by the OpenAI API based on the provided prompt and model. The `text` field inside `choices` contains the completed text, and other fields provide additional information about the completion.

Feel free to modify the code and experiment with different prompts and models to generate different completions, subject to LICENSE.