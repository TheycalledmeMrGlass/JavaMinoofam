package com.company;

public class Main {

    public static void main(String[] args) {
        X x = new X();
        x.n = 0;
        System.out.println("n = " + x.n);
        x.isEven();
        x.isOdd();
        x.isPositive();
        x.isNegative();
        x.isZero();
        x.n = 1;
        System.out.println("n = " + x.n);
        x.isEven();
        x.isOdd();
        x.isPositive();
        x.isNegative();
        x.isZero();
        x.n = -2;
        System.out.println("n = " + x.n);
        x.isEven();
        x.isOdd();
        x.isPositive();
        x.isNegative();
        x.isZero();
	// write your code here
    }
}
