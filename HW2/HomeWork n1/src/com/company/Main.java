package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       Surface rectangle=new Surface();
       Surface othershape=new Surface();
int x,width,length;

        System.out.println("enter the size of rectangle width");
width=input.nextInt();
        System.out.println("enter the size of rectangle length");
length=input.nextInt();
        System.out.println("enter the size of other shape");
x=input.nextInt();

rectangle.S(width,length);
othershape.Os(x);
      rectangle.calculating();
      othershape.calculatingn2();




    }
}