package com.liumq.springboottest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

public class MvcInterceptorConfig  extends WebMvcConfigurationSupport {

    @Autowired
    private MyInterceptor myInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        System.out.println("==========MyInterceptor===========");
        registry.addInterceptor(myInterceptor).addPathPatterns("/**").excludePathPatterns("register");

        super.addInterceptors(registry);
    }
}
