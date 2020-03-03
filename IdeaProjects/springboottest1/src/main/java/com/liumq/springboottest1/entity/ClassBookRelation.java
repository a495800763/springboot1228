package com.liumq.springboottest1.entity;

public class ClassBookRelation extends ClassBookRelationKey {

    private String classname;

    private String bookname;

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    @Override
    public String toString() {
        return "ClassBookRelation{" +
                "classname='" + classname + '\'' +
                ", bookname='" + bookname + '\'' +
                "} " + super.toString();
    }
}