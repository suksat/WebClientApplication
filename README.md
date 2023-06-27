# ChatGPT Spring Boot program v1

ChatGPT Spring Boot program v1 deals with sending POST request to 
```https://api.openai.com/v1/completions``` 

with following JSON: -

```
{
  "model": "text-davinci-003",
  "prompt": "temperature of Nagpur",
  "temperature": 1,
  "max_tokens": 256,
  "top_p": 1,
  "frequency_penalty": 0,
  "presence_penalty": 0
}
```
## Output JSON
```
{
"id": "cmpl-7W6BJEcTL3K0uDJ8Ve0kEAb777Uwh",
"object": "text_completion",
"created": 1687884613,
"model": "text-davinci-003",
"choices": [
{
"text": "\n\nThe average temperature in Nagpur is 28°C (82°F). The months of December, January and February are the coldest months with an average temperature of 15°C-20°C (59°F-68°F), while the summer months of April, May and June are the hottest with an average temperature of 35°C-45°C (95°F-113°F).",
"index": 0,
"logprobs": null,
"finish_reason": "stop"
}
],
"usage": {
"prompt_tokens": 6,
"completion_tokens": 85,
"total_tokens": 91
}
}
```

