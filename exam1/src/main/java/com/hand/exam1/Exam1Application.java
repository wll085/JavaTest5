package com.hand.exam1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = {"com.hand.exam1"})
@MapperScan("com.hand.exam1.mapper")
public class Exam1Application {

    public static void main(String[] args) {

        SpringApplication.run(Exam1Application.class, args);
    }
}
