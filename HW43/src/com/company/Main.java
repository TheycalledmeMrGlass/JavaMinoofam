package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
     Scanner input=new Scanner(System.in) ;
     Generic st=new Generic();
        System.out.println("enter the name");
        st.name=input.nextLine();
        System.out.println("enter the father name");
        st.fathername=input.nextLine();
        System.out.println("enter the id");
        st.id=input.nextInt();
   try{
       new Myjob();
   }catch(Exception e){
       e.printStackTrace();
   }finally {
       List <String>list=new ArrayList<>();
       for(int i=0;i<6;i++){
           System.out.println("enter the mark");
           list.add(st.getMark());
           st.setMark(input.next());
       }
       for(String s:list){
           System.out.println(s);
       }
   }












        // write your code here
    }



}
