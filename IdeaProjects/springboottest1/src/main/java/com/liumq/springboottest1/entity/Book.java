package com.liumq.springboottest1.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Book {
    private Integer id;

    private String bookname;

    private String isbn;

    private String press;

    private String author;

    private Integer booktype;

    private String imageurl;

    private Date insertbooktime;

    private Date updatebooktime;

    public Book(Integer id, String bookname, String isbn, String press, String author, Integer booktype, String imageurl, Date insertbooktime, Date updatebooktime) {
        this.id = id;
        this.bookname = bookname;
        this.isbn = isbn;
        this.press = press;
        this.author = author;
        this.booktype = booktype;
        this.imageurl = imageurl;
        this.insertbooktime = insertbooktime;
        this.updatebooktime = updatebooktime;
    }

    public Book() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getBooktype() {
        return booktype;
    }

    public void setBooktype(Integer booktype) {
        this.booktype = booktype;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Date getInsertbooktime() {
        return insertbooktime;
    }

    public void setInsertbooktime(Date insertbooktime) {
        this.insertbooktime = insertbooktime;
    }

    public Date getUpdatebooktime() {
        return updatebooktime;
    }

    public void setUpdatebooktime(Date updatebooktime) {
        this.updatebooktime = updatebooktime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bookname=").append(bookname);
        sb.append(", isbn=").append(isbn);
        sb.append(", press=").append(press);
        sb.append(", author=").append(author);
        sb.append(", booktype=").append(booktype);
        sb.append(", imageurl=").append(imageurl);
        sb.append(", insertbooktime=").append(insertbooktime);
        sb.append(", updatebooktime=").append(updatebooktime);
        sb.append("]");
        return sb.toString();
    }
}