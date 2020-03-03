package com.liumq.springboottest1;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MVCConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        System.out.println("==================ViewController================");
        //配置指定请求直接跳转到对应页面
        registry.addViewController("/register").setViewName("register");
        registry.addViewController("/login").setViewName("login");
        WebMvcConfigurer.super.addViewControllers(registry);
    }
}