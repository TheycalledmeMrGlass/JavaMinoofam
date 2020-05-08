package com.company;

public class Ferrari implements Car {
    @Override
    public void Details() {
        System.out.println("It is called Ferrari Enzo. 250 KPM And a Turbo Charge, A Red one");
    }

    @Override
    public void Start() {
        System.out.println("And Here is Enzo");
    }
}
