package com.example.jwxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  JwxtApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(JwxtApplication.class, args);
        GetUserInfo getUserInfo = new GetUserInfo();
        getUserInfo.cj();
    }

}
