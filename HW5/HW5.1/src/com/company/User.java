package com.company;

public class User {
    public String username;
    public String realname;
    public int password;
    public int age;
    public String address;
    public long phonenumber;
    public String education;
    public User(String username,String realname,int password,int age,String address,long phonenumber,String education){
        this.username=username;
        this.realname=realname;
        this.password=password;
        this.age=age;
        this.address=address;
        this.phonenumber=phonenumber;
        this.education=education;
    }
    public User(){};

}
