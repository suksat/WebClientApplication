package com.example.demo9i.model;

import java.util.List;

public class CompletionChoice {
    private String text;
    private int index;
    private List<Double> logprobs;
    private String finish_reason;

    public CompletionChoice() {
    }

    public CompletionChoice(String text, int index, List<Double> logprobs, String finish_reason) {
        this.text = text;
        this.index = index;
        this.logprobs = logprobs;
        this.finish_reason = finish_reason;
    }

    // Adding getters and setters

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public List<Double> getLogprobs() {
        return logprobs;
    }

    public void setLogprobs(List<Double> logprobs) {
        this.logprobs = logprobs;
    }

    public String getFinish_reason() {
        return finish_reason;
    }

    public void setFinish_reason(String finish_reason) {
        this.finish_reason = finish_reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompletionChoice)) return false;

        CompletionChoice that = (CompletionChoice) o;

        if (getIndex() != that.getIndex()) return false;
        if (!getText().equals(that.getText())) return false;
        if (!getLogprobs().equals(that.getLogprobs())) return false;
        return getFinish_reason().equals(that.getFinish_reason());
    }

    @Override
    public int hashCode() {
        int result = getText().hashCode();
        result = 31 * result + getIndex();
        result = 31 * result + getLogprobs().hashCode();
        result = 31 * result + getFinish_reason().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "CompletionChoice{" +
                "text='" + text + '\'' +
                ", index=" + index +
                ", logprobs=" + logprobs +
                ", finish_reason='" + finish_reason + '\'' +
                '}';
    }
}
