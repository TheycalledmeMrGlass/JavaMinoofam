package com.company;
import java.util.*;
import java.rmi.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        try{
            Service service=(Service)Naming.lookup("//localhost/serivce");
            int i=0;
            while(true){
                System.out.println("1\t Add user \n2\t Login\n3\tExit\n");
                Scanner input=new Scanner(System.in);
                switch (input.nextInt()){
                    case 1:
                        System.out.println("enter username");
                        String x=input.next();
                        System.out.println("Enter Password");
                        String y=input.next();
                        i+=1;
                        try{
service.save(new Entity().setId(i).setUser(x).setPass(y));

                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        int t=0;
                        String temp=null;
                        System.out.println("enter Username:");
                        x=input.next();
                        try{
                            List<String> users=new ArrayList<>();
                            List<String> passes=new ArrayList<>();
                            for(Entity en:service.report()){
                                users.add(en.getUser());
                                passes.add(en.getPass());
                            }
                            if(users.contains(x)==false){
                                System.out.println("user does not exist");
                            }else{
                                t=users.indexOf(x);
                                temp=passes.get(t);
                            }
                            System.out.println("enter Password :");
                                y=input.next();
                                if(y.equals(temp)){
                                    System.out.println("Login Successful \n 1\t Editing Information\n 2\t Exit \n");
                                    switch (input.nextInt()){
                                        case 1:
                                            System.out.println("enter username :");
                                            x=input.next();
                                            System.out.println("enter PassWord");
                                            y=input.next();
                                            service.edit(new Entity().setId(t+1).setUser(x).setPass(y));
                                            break;
                                        case 2:
                                            System.exit(0);
                                            break;
                                    }
                                }
                                else{
                                    System.out.println("Wrong Password");
                                }


                        }catch (Exception e){
                            System.out.println("falied to report"+e.getMessage());
                        }
                    case 3:
                        System.out.println("Thanks");
                        System.exit(0);
                        break;
                }

            }
        }catch (RemoteException e){
            e.printStackTrace();
        }catch (NotBoundException f){
            f.printStackTrace();
        }catch (MalformedURLException g){
            g.printStackTrace();
        }
	// write your code here
    }
}
