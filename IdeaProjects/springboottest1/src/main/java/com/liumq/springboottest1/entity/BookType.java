package com.liumq.springboottest1.entity;

import org.springframework.stereotype.Component;

@Component
public class BookType {
    private Integer id;

    private Integer booktype;

    private String typename;

    public BookType(Integer id, Integer booktype, String typename) {
        this.id = id;
        this.booktype = booktype;
        this.typename = typename;
    }

    public BookType() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBooktype() {
        return booktype;
    }

    public void setBooktype(Integer booktype) {
        this.booktype = booktype;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", booktype=").append(booktype);
        sb.append(", typename=").append(typename);
        sb.append("]");
        return sb.toString();
    }
}