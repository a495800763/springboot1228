package com.liumq.springboottest1.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.liumq.springboottest1.Dto.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.liumq.springboottest1.entity.Book;
import com.liumq.springboottest1.entity.BookType;
import com.liumq.springboottest1.entity.User;
import com.liumq.springboottest1.service.LoginService;

import java.io.File;
import java.util.*;

import static com.liumq.springboottest1.util.UtilTool.imageMap;

@RestController
public class helloController {

    @Autowired
    LoginService loginService;

    @GetMapping("/")
    public Result hello(Model model) {
        Result r= Result.ok();
        List<BookType> typeResultBookTypes = loginService.getAllBookType();
        List<Book> result = loginService.getAllBook();
        Map<String,Object> dataResult = new HashMap<>();
        dataResult.put("typeResultBookTypes",typeResultBookTypes);
        dataResult.put("result",result);
        r.setData(dataResult);
        return r;
    }

    @RequestMapping(value = "registerConfirm", method = RequestMethod.POST)
    public ModelAndView register(@RequestParam("username") String userName,
                                 @RequestParam("password") String password,
                                 @RequestParam("confirmpassword") String passwordNew,
                                 @RequestParam("usertype") Integer userType,
                                 @RequestParam("file") String file,
                                 ModelAndView mav) {
        System.out.println("===============拦截注册成功===============");
        boolean result = false;
        if (password.equals("") || password == null) {
            mav.addObject("info", "请正确输入密码");
            mav.setViewName("regisfailed");
        } else if (userName.equals("") || userName == null) {
            mav.addObject("info", "用户名不能为空");
            mav.setViewName("regisfailed");
        } else {

            if (password.equals(passwordNew)) {
                String currentUrl = imageMap.get(file);
                result = loginService.userRegister(password, userName, userType, currentUrl);
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

    @RequestMapping(value = "tologin")
    public ModelAndView userLogin(@RequestParam("username") String username, @RequestParam("password") String password,
                                  ModelAndView mav, HttpServletRequest request) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        User userLoginedUser = loginService.userLogin(user);
        request.getSession().setAttribute("userInfo", userLoginedUser);
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping("select")
    public ModelAndView selectBookOrClass(@RequestParam("classname") String classname, ModelAndView mav, HttpSession session) {
        return mav;
    }

    @RequestMapping("test")
    public String test() {
        return "fileUpload";
    }

    @PostMapping("/uploadImage")
    @ResponseBody
    public String upFile(@RequestParam("file") MultipartFile file) {
        //最终路径
        String lastPath = "";
        String path = "D:/devsoft1/img/";
        String fileName = file.getOriginalFilename();
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        fileName = UUID.randomUUID() + suffixName;
        System.out.println(fileName);
        System.out.println("type::" + suffixName);
        System.out.println("filename::" + fileName);
        File targetFile = new File(path);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        File saveFile = new File(targetFile, fileName);
        try {
            file.transferTo(saveFile);
            System.out.println("执行成功");
            lastPath = path + fileName;
            System.out.println(lastPath);
            //     return "success";
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("执行失败");
            return "failed";
        }
        imageMap.put(file.getOriginalFilename(), lastPath);
        for (Map.Entry<String, String> a : imageMap.entrySet()) {
            System.out.println("+++++++++++++" + a.getKey() + "+++++++++++++");
            System.out.println("+++++++++++++" + a.getValue() + "+++++++++++++");

        }
        System.out.println("11111");
        return "success";
    }

    @RequestMapping("/jasonTest")
    public Result getMap() {

        Result r = Result.ok();
        Map<String, Object> result = new HashMap<>(3);
        User user = new User();
        user.setUsername("柳梦琦");
        user.setPassword("1234567489l");
        user.setInsertdatetime(new Date());
        result.put("用户信息", user);
        result.put("网站", "http://www.baidu.com");
        result.put("CSDN地址", null);
        result.put("粉丝数量", 1235);
        r.setData(result);
        return r;
    }

}
