package com.example.demo9i.model;

public class Usage {
    private int prompt_tokens;
    private int completion_tokens;
    private int total_tokens;

    public Usage() {
    }

    public Usage(int prompt_tokens, int completion_tokens, int total_tokens) {
        this.prompt_tokens = prompt_tokens;
        this.completion_tokens = completion_tokens;
        this.total_tokens = total_tokens;
    }

    // Adding getters and setters

    public int getPrompt_tokens() {
        return prompt_tokens;
    }

    public void setPrompt_tokens(int prompt_tokens) {
        this.prompt_tokens = prompt_tokens;
    }

    public int getCompletion_tokens() {
        return completion_tokens;
    }

    public void setCompletion_tokens(int completion_tokens) {
        this.completion_tokens = completion_tokens;
    }

    public int getTotal_tokens() {
        return total_tokens;
    }

    public void setTotal_tokens(int total_tokens) {
        this.total_tokens = total_tokens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usage)) return false;

        Usage usage = (Usage) o;

        if (getPrompt_tokens() != usage.getPrompt_tokens()) return false;
        if (getCompletion_tokens() != usage.getCompletion_tokens()) return false;
        return getTotal_tokens() == usage.getTotal_tokens();
    }

    @Override
    public int hashCode() {
        int result = getPrompt_tokens();
        result = 31 * result + getCompletion_tokens();
        result = 31 * result + getTotal_tokens();
        return result;
    }

    @Override
    public String toString() {
        return "Usage{" +
                "prompt_tokens=" + prompt_tokens +
                ", completion_tokens=" + completion_tokens +
                ", total_tokens=" + total_tokens +
                '}';
    }
}
