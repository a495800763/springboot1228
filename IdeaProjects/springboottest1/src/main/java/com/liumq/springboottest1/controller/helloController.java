package com.liumq.springboottest1.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.liumq.springboottest1.entity.Book;
import com.liumq.springboottest1.entity.BookType;
import com.liumq.springboottest1.entity.User;
import com.liumq.springboottest1.service.LoginService;

import java.util.List;

@Controller
public class helloController {

    @Autowired
    LoginService loginService;

    @GetMapping("/")
    public String hello(Model model) {
        List<BookType> typeResultBookTypes = loginService.getAllBookType();
        List<Book> result = loginService.getAllBook();
        model.addAttribute("resultList", typeResultBookTypes);
        model.addAttribute("bookList", result);
        System.out.println("==========开始打印....==========");
        for (BookType item : typeResultBookTypes) {
            System.out.println(item.toString());
        }
        System.out.println("==========书籍....==========");
        for (Book item : result) {
            System.out.println(item.toString());
        }
        return "index";

    }

    @GetMapping("registerConfirm")
    public ModelAndView register(@RequestParam("username") String userName, @RequestParam("password") String password,
                                 @RequestParam("confirmpassword") String passwordNew, @RequestParam("usertype") Integer userType,
                                 ModelAndView mav) {
        System.out.println("===============拦截登录成功===============");
        System.out.println("username：" + userName);
        System.out.println("password：" + password);
        System.out.println("passwordNew：" + passwordNew);
        System.out.println("usertype：" + userType);
        boolean result = false;
        if (password.equals("") || password == null) {
            mav.addObject("info", "请正确输入密码");
            mav.setViewName("regisfailed");
        } else if (userName.equals("") || userName == null) {
            mav.addObject("info", "用户名不能为空");
            mav.setViewName("regisfailed");
        } else {

            if (password.equals(passwordNew)) {
                result = loginService.userRegister(password, userName, userType);
            } else {
                mav.addObject("info", "两次输入的密码不一致");
            }
            if (result) {
                mav.setViewName("regissuccess");
            } else {
                mav.setViewName("regisfailed");
            }
        }
        return mav;
    }

    @RequestMapping("tologin")
    public ModelAndView userLogin(@RequestParam("username") String username, @RequestParam("password") String password,
                                  ModelAndView mav, HttpSession session) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        User userLoginedUser = loginService.userLogin(user);
        // TODO
        return mav;
    }

    /**
     * @RequestMapping(value ="/pathVariableTest/{userId}") public String
     *                       testPage(@PathVariable Integer userId) {
     *                       System.out.println("得到的用户id是："+userId); return "index";
     *                       }
     *
     * @RequestMapping(value = "requestHeaderTest") public String
     *                       requestHeadderTest(@RequestHeader(name
     *                       =HttpHeaders.ACCEPT_LANGUAGE) String language) {
     *                       System.out.println("得到的数据是："+language);
     *
     *                       return "index"; }
     *
     * @RequestMapping(value = "/cookieValueTest") public String
     *                       cookieValueTest(@CookieValue(value =
     *                       "JSESSIONID",defaultValue = "")String sessionId) {
     *                       System.out.println("cookieValueTest得到的数据是："+sessionId);
     *                       return "index"; }
     **/

}
