package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Studing student=new Studing();
        student.entering();
        System.out.println("enter the programming mark");
        student.ProgrammingMark=input.nextInt();
        System.out.println("enter the Math mark");
        student.MathMark=input.nextInt();
        System.out.println("enter the english mark");
        student.EnglishMark=input.nextInt();
        System.out.println("enter the religious mark");
        student.ReligiousMark=input.nextInt();
        int sum=(student.EnglishMark*student.ED)+(student.ProgrammingMark*student.PD)+(student.ReligiousMark*student.RD)+(student.MathMark*student.MD);
        int avg=sum/8;
        System.out.println("the avg is "+avg);
        if(avg<12){
            System.out.println("You Failed");
        }
        else{
            System.out.println("you passed");
        }



	// write your code here
    }
}
