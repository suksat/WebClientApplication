package com.example.demo9i.model;

import java.util.List;

public class CompletionResponse {
    private String id;
    private String object;
    private long created;
    private String model;
    private List<CompletionChoice> choices;
    private Usage usage;

    public CompletionResponse() {
    }
    public CompletionResponse(String id, String object, long created, String model, List<CompletionChoice> choices, Usage usage) {
        this.id = id;
        this.object = object;
        this.created = created;
        this.model = model;
        this.choices = choices;
        this.usage = usage;
    }

    // Adding getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<CompletionChoice> getChoices() {
        return choices;
    }

    public void setChoices(List<CompletionChoice> choices) {
        this.choices = choices;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompletionResponse)) return false;

        CompletionResponse that = (CompletionResponse) o;

        if (getCreated() != that.getCreated()) return false;
        if (!getId().equals(that.getId())) return false;
        if (!getObject().equals(that.getObject())) return false;
        if (!getModel().equals(that.getModel())) return false;
        if (!getChoices().equals(that.getChoices())) return false;
        return getUsage().equals(that.getUsage());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getObject().hashCode();
        result = 31 * result + (int) (getCreated() ^ (getCreated() >>> 32));
        result = 31 * result + getModel().hashCode();
        result = 31 * result + getChoices().hashCode();
        result = 31 * result + getUsage().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "CompletionResponse{" +
                "id='" + id + '\'' +
                ", object='" + object + '\'' +
                ", created=" + created +
                ", model='" + model + '\'' +
                ", choices=" + choices +
                ", usage=" + usage +
                '}';
    }
}

