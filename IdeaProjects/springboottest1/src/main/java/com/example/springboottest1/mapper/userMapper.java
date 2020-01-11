package com.example.springboottest1.mapper;

import com.example.springboottest1.entity.user;
import org.apache.ibatis.annotations.Param;

public interface userMapper {
    //用户登录
    user userlogin(@Param("name") String name, @Param("password") String password);

    //注册新用户(方式1)
    int adduser(@Param("name") String name, @Param("password") String password);

    //注册新用户（方式2）
    int adduser1(@Param("name") String name, @Param("password") String password);

}