package com.example.jwxt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JwxtApplicationTests {

    @Autowired
    private SendEmail email;

    @Test
    void contextLoads() {
        GetUserInfo getUserInfo = new GetUserInfo();
        email.sendSimpleMail("1493020035@qq.com","测试","1234");
    }

}
