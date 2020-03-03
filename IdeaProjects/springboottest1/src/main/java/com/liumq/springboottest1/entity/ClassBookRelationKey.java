package com.liumq.springboottest1.entity;

public class ClassBookRelationKey {

    private Integer bookid;

    private Integer classid;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    @Override
    public String toString() {
        return "ClassBookRelationKey{" +
                "bookid=" + bookid +
                ", classid=" + classid +
                '}';
    }
}