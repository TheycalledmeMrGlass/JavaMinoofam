package com.company;
import java.util.*;
import java.rmi.*;
import java.net.*;
public class Main {
    public static void main(String[] args) {
      try{
          Service service=(Service)Naming.lookup("//localhost/service");
          Entity entity=new Entity().setId(1).setUser("ali").setPass("ali123").setBalance(10000);
          service.save(entity);
          Scanner input=new Scanner(System.in);
          System.out.println("enter username");
          if(input.next().equals("ali")){
              System.out.println("enter password");
              if(input.next().equals("ali123")){
                  System.out.println("susscessfully logged in \n 1- Deposit \n 2-Withdraw\n");
                  switch (input.nextInt()){
                      case 1:
                          System.out.println("enter Deposit Amount");
                          entity=new Entity().setId(entity.getId()).setUser(entity.getUser()).setPass(entity.getPass()).setBalance(100+input.nextInt());
                          service.edit(entity);
                          break;
                      case 2:
                          System.out.println("enter withdraw amount:");
                          entity=new Entity().setId(entity.getId()).setUser(entity.getUser()).setPass(entity.getPass()).setBalance(100+input.nextInt());
                          service.edit(entity);
                  }

              }else {
                  System.out.println("wrong password");
                  System.exit(0);
              }
          } else{
              System.out.println("wrong username");
              System.exit(0);
          }
      }catch (RemoteException e){
          System.out.println("could't be handled"+e.getMessage());
          e.printStackTrace();
      }catch (NotBoundException f){
          f.printStackTrace();
      }catch(MalformedURLException g){
          g.printStackTrace();
      }catch(Exception e){
          e.printStackTrace();
      }

    }
}
