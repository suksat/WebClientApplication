package com.example.demo9i.model;

public class CompletionRequest {
    private String model;
    private String prompt;
    private int temperature;
    private int max_tokens;
    private double top_p;
    private double frequency_penalty;
    private double presence_penalty;

    public CompletionRequest() {
    }

    public CompletionRequest(String model, String prompt, int temperature, int max_tokens, double top_p, double frequency_penalty, double presence_penalty) {
        this.model = model;
        this.prompt = prompt;
        this.temperature = temperature;
        this.max_tokens = max_tokens;
        this.top_p = top_p;
        this.frequency_penalty = frequency_penalty;
        this.presence_penalty = presence_penalty;
    }

    // Adding getters and setters

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getMax_tokens() {
        return max_tokens;
    }

    public void setMax_tokens(int max_tokens) {
        this.max_tokens = max_tokens;
    }

    public double getTop_p() {
        return top_p;
    }

    public void setTop_p(double top_p) {
        this.top_p = top_p;
    }

    public double getFrequency_penalty() {
        return frequency_penalty;
    }

    public void setFrequency_penalty(double frequency_penalty) {
        this.frequency_penalty = frequency_penalty;
    }

    public double getPresence_penalty() {
        return presence_penalty;
    }

    public void setPresence_penalty(double presence_penalty) {
        this.presence_penalty = presence_penalty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompletionRequest)) return false;

        CompletionRequest that = (CompletionRequest) o;

        if (getTemperature() != that.getTemperature()) return false;
        if (getMax_tokens() != that.getMax_tokens()) return false;
        if (Double.compare(that.getTop_p(), getTop_p()) != 0) return false;
        if (Double.compare(that.getFrequency_penalty(), getFrequency_penalty()) != 0) return false;
        if (Double.compare(that.getPresence_penalty(), getPresence_penalty()) != 0) return false;
        if (!getModel().equals(that.getModel())) return false;
        return getPrompt().equals(that.getPrompt());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getModel().hashCode();
        result = 31 * result + getPrompt().hashCode();
        result = 31 * result + getTemperature();
        result = 31 * result + getMax_tokens();
        temp = Double.doubleToLongBits(getTop_p());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getFrequency_penalty());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPresence_penalty());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "CompletionRequest{" +
                "model='" + model + '\'' +
                ", prompt='" + prompt + '\'' +
                ", temperature=" + temperature +
                ", max_tokens=" + max_tokens +
                ", top_p=" + top_p +
                ", frequency_penalty=" + frequency_penalty +
                ", presence_penalty=" + presence_penalty +
                '}';
    }
}
