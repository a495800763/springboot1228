package com.liumq.springboottest1.service;

import java.util.Date;
import java.util.List;

import com.liumq.springboottest1.serviceinterface.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.liumq.springboottest1.entity.User;
import com.liumq.springboottest1.mapper.BookMapper;
import com.liumq.springboottest1.mapper.BookTypeMapper;
import com.liumq.springboottest1.mapper.UserMapper;
import com.liumq.springboottest1.entity.*;


@Component
public class LoginService implements ILoginService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private BookTypeMapper bookTypeMapper;
    @Autowired
    private BookMapper bookMapper;


    @Override
    public void insertData() {
        User user = new User();
        user.setUsername("liumq");
        user.setPassword("123456789");
        //user.setInsertdatetime(new Date());
        System.out.println("第一次插入的时候的值如下:");
        System.out.println(user.toString());
        userMapper.insert(user);
        return;
    }

    @Override
    public void updateUser() {
        User user = new User();
        user.setUsername("liumq");
        user.setPassword("495800793");
        userMapper.updateByUserName(user);
        return;
    }

    @Override
	public List<BookType> getAllBookType() {
        return bookTypeMapper.selectAllBookType();
    }


    @Override
	public List<Book> getAllBook() {
        return bookMapper.selectAllBook();
    }

    @Override
	public boolean userRegister(String password, String userName, Integer userType) {

        if (userMapper.selectByUserName(userName) == 0) {
            User user = new User();
            user.setPassword(password);
            user.setUsername(userName);
            user.setUsertype(userType);
            user.setInsertdatetime(new Date());
            int num = userMapper.insert(user);
            System.out.println("======" + num + "=====");
            return num == 1;
        } else {
            return false;
        }
    }

    @Override
	public User userLogin(User user) {
        User userLogined = userMapper.selectByUser(user);
        return userLogined;
    }

}
