package com.example.springboottest1.entity;

import java.util.Date;

public class bookInfo {

    private Long autoid;

    private String bookname;

    private Date inserttime;

    private String author;

    private String press;

    public Long getAutoid() {
        return autoid;
    }

    public void setAutoid(Long autoid) {
        this.autoid = autoid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press == null ? null : press.trim();
    }
}