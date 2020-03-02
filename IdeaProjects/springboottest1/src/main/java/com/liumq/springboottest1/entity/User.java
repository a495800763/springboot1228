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

    public User(Integer id, String username, String password, Date insertdatetime, Integer usertype) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.insertdatetime = insertdatetime;
        this.usertype = usertype;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", insertdatetime=").append(insertdatetime);
        sb.append(", usertype=").append(usertype);
        sb.append("]");
        return sb.toString();
    }
}