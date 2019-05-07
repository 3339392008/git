package com.lpy.pojo;

public class User {
    public User() {

    }
    public User(Integer id, String name, String pwd, String introduce) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.introduce = introduce;
    }

    private Integer id;
    private String name;
    private String pwd;
    private String introduce;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
