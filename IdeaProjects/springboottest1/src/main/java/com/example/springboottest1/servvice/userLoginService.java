package com.example.springboottest1.servvice;

import com.example.springboottest1.entity.user;
import com.example.springboottest1.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class userLoginService {
    /**
     * 注入dao
     */
    @Autowired
    private userMapper usermapper;

    //用户登录
    public user userLogin(String username, String password) {
        user user = usermapper.userlogin(username, password);
        return user;
    }

    //注册新用户
    public int adduser(String username, String password) {


        return usermapper.adduser(username, password);
        //return usermapper.adduser1(username,password,age);     //对应sql语句中的第二种注册方式
    }
}
