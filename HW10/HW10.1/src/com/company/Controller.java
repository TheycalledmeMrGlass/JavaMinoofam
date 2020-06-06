package com.company;
import java.util.*;
public class Controller {
public String name,familyname,fathername;
public void save(){
try{
    Service.getInstance().save(new Entity().setName(name).setFamilyname(familyname).setFathername(fathername));
}catch (Exception e){
    System.out.println("couldnt save"+e.getMessage());
}
}
public List<Entity> show(){
List<Entity> entityList=new ArrayList<>();
try{
   entityList= Service.getInstance().report();
}catch (Exception f){
    System.out.println("couldnt report"+f.getMessage());
}
return entityList;
}
}
