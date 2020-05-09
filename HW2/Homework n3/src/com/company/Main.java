package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
Solving s=new Solving();
            System.out.println("");
        System.out.println("enter a");
        s.a=input.nextInt();
        System.out.println("enter b");
        s.b=input.nextInt();
        System.out.println("enter e");
        s.e=input.nextInt();
        System.out.println("enter f");
        s.f=input.nextInt();
        System.out.println("enter d");
        s.d=input.nextInt();
        System.out.println("enter c");
        s.c=input.nextInt();
            int x=((s.e*s.d)-(s.b*s.f))/((s.a*s.d)-(s.b*s.c));
            int y=((s.a*s.f)-(s.e*s.c))/((s.a*s.d)-(s.b*s.c));
        System.out.println("x is "+x);
        System.out.println(" y is "+y);
        if(x<0 && y<0) {
                System.out.println("this has no answer");
        }

	// write your code here
    }
}
