package com.example.demo.entity;

public class User {

    private String id;
    private String name;
    private String sex;
    private String age ;
    private String phone;
    private String password;

   // private String memo;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /*   public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }*/
}
