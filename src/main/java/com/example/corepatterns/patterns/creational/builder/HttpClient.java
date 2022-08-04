package com.example.corepatterns.patterns.creational.builder;

public class HttpClient {

    private String method;
    private String url;
    private String userName;
    private String password;
    private String headers;
    private String body;

    public HttpClient(HttpClientBuilder builder){
        this.method=builder.method;
        this.headers=builder.headers;
        this.url=builder.url;
        this.userName=builder.userName;
        this.password=builder.password;
        this.body=builder.body;
    }

    @Override
    public String toString() {
        return "HttpClient{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", headers='" + headers + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public static class HttpClientBuilder{
        private String method;
        private String url;
        private String userName;
        private String password;
        private String headers;
        private String body;

        public HttpClientBuilder method(String method){
            this.method=method;
            return this;
        }

        public HttpClientBuilder url(String url){
            this.url=url;
            return this;
        }

        public HttpClientBuilder secure(String userName,String password){
            this.userName=userName;
            this.password=password;
            return this;
        }

        public HttpClientBuilder headers(String headers){
            this.headers=headers;
            return this;
        }

        public HttpClientBuilder body(String body){
            this.body=body ;
            return this;
        }

        public HttpClient build(){
         return new HttpClient(this);
        }
    }
}
