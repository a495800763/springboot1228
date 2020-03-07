package com.liumq.springboottest1.service;

import java.util.Date;
import java.util.List;

import com.liumq.springboottest1.entityaction.UserAction;
import com.liumq.springboottest1.serviceinterface.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.liumq.springboottest1.entity.User;
import com.liumq.springboottest1.mapper.BookMapper;
import com.liumq.springboottest1.mapper.BookTypeMapper;
import com.liumq.springboottest1.entity.*;


@Component
public class LoginService implements ILoginService {

    @Autowired
    private UserAction userAction;
    @Autowired
    private BookTypeMapper bookTypeMapper;
    @Autowired
    private BookMapper bookMapper;


    @Override
    public void insertData() {
        userAction.insertDate();
        return;
    }

    @Override
    public void updateUser() {
       userAction.updateUser();
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
	public boolean userRegister(String password, String userName, Integer userType ,String imageUrl) {

        if (userAction.selectByUserName(userName) == 0) {
            User user = new User();
            user.setPassword(password);
            user.setUsername(userName);
            user.setUsertype(userType);
            user.setImageurl(imageUrl);
            user.setInsertdatetime(new Date());
            int num = userAction.userRegistered(user);
            System.out.println("======" + num + "=====");
            return num == 1;
        } else {
            return false;
        }
    }

    @Override
	public User userLogin(User user) {
//        User userLogined = userMapper.selectByUser(user);
//        return userLogined;
        return null;
    }

}
