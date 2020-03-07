package com.liumq.springboottest1.entityaction;

import com.liumq.springboottest1.entity.User;
import com.liumq.springboottest1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserAction extends  BaseAction {

    @Autowired
    private UserMapper userMapper;


    public int selectByUserName (String name)
    {
        return userMapper.selectByUserName(name);
    }

    public void insertDate ()
    {
        User user = new User();
        user.setUsername("liumq");
        user.setPassword("123456789");
        System.out.println("第一次插入的时候的值如下:");
        System.out.println(user.toString());
        userMapper.insert(user);
        return;
    }

    public void updateUser() {
        User user = new User();
        user.setUsername("liumq");
        user.setPassword("495800793");
        userMapper.updateByUserName(user);
        return;
    }

    public int userRegistered(User user)
    {
       return 0;
    }
}
