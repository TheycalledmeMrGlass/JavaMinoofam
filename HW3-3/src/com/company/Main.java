package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the String");
        System.out.println("enter a number");
        String Str;
        int r,x;
        Str=input.next();
        r=input.nextInt();


            if(Str.matches(".*\\d.*")){
                try{
                    System.out.println(Str.matches(".*\\d.*"));
                }catch(Exception e){
                    System.out.println("contains a number");
                    System.out.println(e.getMessage());
                    System.out.println(e.getClass());
                }
            }
            else{
                System.out.println(Str.length());
            }


	// write your code here
    }
}
