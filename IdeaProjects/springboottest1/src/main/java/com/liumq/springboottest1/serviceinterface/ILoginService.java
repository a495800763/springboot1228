package com.liumq.springboottest1.serviceinterface;

import com.liumq.springboottest1.entity.Book;
import com.liumq.springboottest1.entity.BookType;
import com.liumq.springboottest1.entity.User;

import java.util.List;

public interface ILoginService {

     void insertData ();

     void updateUser();

    List<BookType> getAllBookType();

    List<Book> getAllBook();

    boolean userRegister(String password, String userName, Integer userType);

     User userLogin(User user);
}
