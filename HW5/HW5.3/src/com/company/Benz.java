package com.company;

public class Benz implements Car {
    @Override
    public void Details() {
        System.out.println("It is Called Benz,300 KPM, A Black One , 1500 HP");
    }

    @Override
    public void Start() {
        System.out.println("And Here Is S500 Benz");
    }
}
