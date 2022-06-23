package com.example.jwxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class  JwxtApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(JwxtApplication.class, args);
        GetUserInfo getUserInfo = new GetUserInfo();
        getUserInfo.cj();
    }

}
