package com.company;

public class Controller {
public void check(String username,int password){
    try{
int id  ;
        Service.getInstance().report(new Entity().setusername());
    }catch (Exception e){
        System.out.println("couldn't save"+e.getMessage());
    }

}
    public void buy(int id,String username,int password){
    try{
        Service.getInstance().save(new Entity().setId(id));
    }catch(Exception e){
        System.out.println("failed"+e.getMessage());
    }

    }
    public void show(){
        System.out.println("please choose a number between 1 to 4");
    }
}
