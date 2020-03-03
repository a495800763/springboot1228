package com.liumq.springboottest1.entity;

import java.util.Date;

public class ClassInfo {

    private Integer autoid;

    private String classname;

    private String teacher;

    private Integer grade;

    private Date inserttime;

    public Integer getAutoid() {
        return autoid;
    }

    public void setAutoid(Integer autoid) {
        this.autoid = autoid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    @Override
    public String toString() {
        return "ClassInfo{" +
                "autoid=" + autoid +
                ", classname='" + classname + '\'' +
                ", teacher='" + teacher + '\'' +
                ", grade=" + grade +
                ", inserttime=" + inserttime +
                '}';
    }
}