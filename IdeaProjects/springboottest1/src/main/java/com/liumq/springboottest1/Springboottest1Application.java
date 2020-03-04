package com.liumq.springboottest1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liumq.springboottest1.mapper")
public class Springboottest1Application {

    public static void main(String[] args)
    {
        SpringApplication.run(Springboottest1Application.class, args);
    }
}
