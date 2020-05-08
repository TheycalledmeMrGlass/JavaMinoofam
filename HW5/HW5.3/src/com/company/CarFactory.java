package com.company;

public class CarFactory {
    public static Car getcar(int c){
        switch (c){
            case 1:
                return new BMW();
            case 2:
                return new Benz();
            case 3:
                return new Porsche();
            case 4:
                return new Ferrari();
            default:
                return null;
        }
    }
}
