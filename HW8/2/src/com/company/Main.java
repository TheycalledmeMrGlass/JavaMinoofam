package com.company;

public class Main {

    public static void main(String[] args) {
        try{
            Service.getInstance().save(new Entity());

        }catch (Exception e){
            System.out.println("couldn't save"+e.getMessage());
        }
        try{
Service.getInstance().report();
        }catch (Exception f){
            System.out.println("couldn't report"+f.getMessage());
        }
        Myform myform=new Myform();
    }
}
