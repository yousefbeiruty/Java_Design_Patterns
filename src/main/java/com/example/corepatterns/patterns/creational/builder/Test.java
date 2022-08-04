package com.example.corepatterns.patterns.creational.builder;

public class Test {

    public static void main(String[] args) {
        HttpClient httpClient = new HttpClient.HttpClientBuilder()
                .url("https://test.com").body("{}").method("GET").build();
        System.out.println(httpClient);
    }
}
