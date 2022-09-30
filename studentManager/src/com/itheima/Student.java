package com.itheima;
/*
    alt+insert 根据自己需要选择构造方法
 */
public class Student {
    private String name;
    private String age;
    private String sid;
    private String address;

    public Student(){
    }

    public Student(String name, String age, String sid, String address) {
        this.name = name;
        this.age = age;
        this.sid = sid;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
