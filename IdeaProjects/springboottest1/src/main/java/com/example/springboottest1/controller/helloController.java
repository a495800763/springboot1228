package com.example.springboottest1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:LiuMengQi Description:
 * Date:Created in 10:46 ${Date}
 * Modified by :
 */
@Controller
@RequestMapping(value = {"/hello"})
public class helloController {

    @RequestMapping(value = {"/springboot"})
    public String hello(){
        return "HelloWorld";
    }
}

