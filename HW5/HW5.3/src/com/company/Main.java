package com.company;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your favourite number between 1 to 4");
        int i;
        i=input.nextInt();
       switch(i) {
           case 1:

           Car car1 = CarFactory.getcar(Car.BMW);
           car1.Start();
           car1.Details();
break;
           case 2:
           Car car2 = CarFactory.getcar(Car.Benz);
           car2.Start();
           car2.Details();
           break;
           case 3:
           Car car3 = CarFactory.getcar(Car.Porsche);
           car3.Start();
           car3.Details();
           break;
           case 4:
           Car car4 = CarFactory.getcar(Car.Ferrari);
           car4.Start();
           car4.Details();
       }
	// write your code here
    }
}
