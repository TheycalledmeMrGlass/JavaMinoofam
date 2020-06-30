package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Calc calc=new Calc();
        System.out.println("enter first number");
        String temp=input.next();
        int t=Integer.parseInt(temp);
        calc.a=t;
        System.out.println("enter second number");
        temp=input.next();
        t=Integer.parseInt(temp);
        calc.b=t;
        calc.sum();
        calc.sub();
        calc.mul();
        calc.div();
	// write your code here
    }
}
