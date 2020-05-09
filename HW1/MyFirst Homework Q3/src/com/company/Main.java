package com.company;
import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=4,j=5;

        int c=i+j,d=j-i,e=i*j,f=i/j;

        System.out.println("what do you want to do with these numbers?(+.-.*./)");
int mark;
mark=input.nextInt();



        switch(mark) {
            case 1:
                System.out.println("c is" + c);
                break;

            case 2:
                System.out.println("d is " + d);
                break;
            case 3:
                System.out.println("e is " + e);
                break;
            case 4:
                System.out.println("f is " + f);
                break;
        }
        }


	// write your code here
    }

