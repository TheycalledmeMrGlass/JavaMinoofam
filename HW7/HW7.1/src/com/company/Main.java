package com.company;
import java.util.*;
import java.sql.*;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Controller controller=new Controller();
        System.out.println("enter your username");
        String username=input.next();
        System.out.println("enter your password");
        int password=input.nextInt();
       controller.check(username,password);
       controller.show();
       int z=input.nextInt();
       controller.buy(z,username,password);
	// write your code here
    }
}
