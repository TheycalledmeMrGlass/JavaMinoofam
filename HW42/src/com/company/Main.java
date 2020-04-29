package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
User u=new User();
User u2=new User();
User u3=new User();
u.name=u2.name;
u.name=u3.name;
u.id=u2.id;
u.id=u3.id;
u2.id=u3.id;
u2.name=u3.name;

        System.out.println("enter the name");
        u.name=input.nextLine();
        System.out.println("enter the second name");
        u.name=input.nextLine();
        System.out.println("enter the id ");
        u.id=input.nextInt();
        System.out.println("enter the second id");
        u.id=input.nextInt();
        Map map=new HashMap();
        map.put("name",u.name);
        map.put("name",u.name);
        map.put("id",u.id);
        map.put("id",u.id);
        System.out.println(map.get("name"));
        System.out.println(map.get("name"));
        System.out.println(map.get("name"));
        System.out.println(map.get("id"));
        System.out.println(map.get("id"));
        System.out.println(map.get("id"));
        Set set=map.keySet();
        for(Object o : set){
            System.out.println(o);
        }

    }
}
