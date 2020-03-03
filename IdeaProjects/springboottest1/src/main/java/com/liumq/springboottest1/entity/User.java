package com.liumq.springboottest1.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class User {
    private Integer id;

    private String username;

    private String password;

    private Date insertdatetime;

    private Integer usertype;

    private String imageurl;

    public User(Integer id, String username, String password, Date insertdatetime, Integer usertype,String imageurl) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.insertdatetime = insertdatetime;
        this.usertype = usertype;
        this.imageurl =imageurl;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getInsertdatetime() {
        return insertdatetime;
    }

    public void setInsertdatetime(Date insertdatetime) {
        this.insertdatetime = insertdatetime;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", insertdatetime=" + insertdatetime +
                ", usertype=" + usertype +
                ", imageurl='" + imageurl + '\'' +
                '}';
    }
}
