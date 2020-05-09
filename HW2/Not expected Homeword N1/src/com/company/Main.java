package com.company;
import javax.swing.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
Rectangle R=new Rectangle();
        System.out.println("enter width");
	R.width=input.nextFloat();
        System.out.println("enter length");
        R.length=input.nextFloat();
        if(R.width<0||R.width>20 && R.length<0||R.width>20){
            System.out.println("program cannot start");
        }
        else{
            R.Area();
            System.out.println("Area is"+R.Area());
            R.Permitter();
            System.out.println("Permitter is"+R.Permitter());
            R.answer();
        }

    }
}
