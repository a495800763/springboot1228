package com.example.springboottest1.entity;

public class classInfo {

    private Integer autoid;

    private Integer classnumber;

    private String classname;

    private Integer inorderclassnumber;

    private String teachername;

    public Integer getAutoid() {
        return autoid;
    }

    public void setAutoid(Integer autoid) {
        this.autoid = autoid;
    }

    public Integer getClassnumber() {
        return classnumber;
    }

    public void setClassnumber(Integer classnumber) {
        this.classnumber = classnumber;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Integer getInorderclassnumber() {
        return inorderclassnumber;
    }

    public void setInorderclassnumber(Integer inorderclassnumber) {
        this.inorderclassnumber = inorderclassnumber;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }
}