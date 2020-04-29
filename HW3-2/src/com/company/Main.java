package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("m*x^2+n^x+p is our question");
        int m,n,p,x,y,Delta;

        System.out.println("enter m");
        m=input.nextInt();
        System.out.println("enter n");
        n=input.nextInt();
        System.out.println("enter p");
        p=input.nextInt();
        Delta=(n*n)-4*m*p;
    if(Delta<0){
        try{
            System.out.println(Delta<0);
        }catch (Exception e){
            System.out.println("it s lower than zero");
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
finally {
            System.out.println("it is over");
        }
    }
    else {
        x=(n*-1)+(int)Math.sqrt(Delta)/2*m;
        y=(n*-1)-(int)Math.sqrt(Delta)/2*m;
        System.out.println("x is"+x);
        System.out.println("y is "+y);
    }


	// write your code here
    }
}
