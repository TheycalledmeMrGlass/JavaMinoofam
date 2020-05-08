package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Moshakhasat ra vared konid");
        User u=new User("a2","ali",1234,20,"tehran",912345678,"diploma");
        User u2=new User();
        System.out.println(u.username);
        System.out.println(u.realname);
        System.out.println(u.password);
        System.out.println(u.age);
        System.out.println(u.address);
        System.out.println(u.phonenumber);
        System.out.println(u.education);
	// write your code here
    }
}
