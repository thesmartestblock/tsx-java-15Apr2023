package com.example.tsxjava.Entities;


public class HookResponse {
    String response;

    public HookResponse(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "HookResponse [response=" + response + "]";
    }
}
