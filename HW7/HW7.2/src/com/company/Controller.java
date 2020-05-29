package com.company;
import java.util.*;
public class Controller {
    Scanner input=new Scanner(System.in);
    public void buyingtime(){
        try{
            System.out.println("enter your name");
            String name=input.nextLine();
            System.out.println("enter your id");
            int id=input.nextInt();
            Service.getInstance().report(new Entity().setId(id=input.nextInt());
            System.out.println("choose your favourite model and enter the name of it");
            int model=input.nextInt();
            if(model==1){
Service.getInstance().save(new Entity().setName(name=input.next());
            }else if(model==2){
                Service.getInstance().save(new Entity().setName(name=input.next());
            }else if(model==3){
                Service.getInstance().save(new Entity().setName(name=input.next());
            }
        }catch (Exception e){
            e.getMessage();
        }
    }
}
