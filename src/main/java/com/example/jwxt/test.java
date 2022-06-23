package com.example.jwxt;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Auther: 风萧
 * @Date: 2022/5/23 16:07
 * @Description:这是一个测试类
 */

//@Component
public class test {
    @Scheduled(cron="0/5 * *  * * ? ")
    public static void main(String[] args) {
        System.out.println("good like");
    }
}
