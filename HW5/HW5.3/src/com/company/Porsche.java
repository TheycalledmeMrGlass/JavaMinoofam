package com.company;

public class Porsche implements Car{
    @Override
    public void Details() {
        System.out.println("It is Porsche, It has 230 Speed per Kilometers");
    }

    @Override
    public void Start() {
        System.out.println("And Here is Porsche Camaro s911");
    }
}
