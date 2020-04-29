package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
Student st=new Student();
Student (){
                    System.out.println("class created");
            }

Map map=new HashMap();
        System.out.println("enter student s name");
        st.name=input.nextLine();
        System.out.println("enter student s id");
        st.id=input.nextInt();
        System.out.println("enter student s avg");
        st.avg=input.nextFloat();
        map.put("name",st.name);
        map.put("id",st.id);
        map.put("avg",st.avg);
        System.out.println(map.get("name"));
        System.out.println(map.get("id"));
        System.out.println(map.get("avg"));

    }
}
