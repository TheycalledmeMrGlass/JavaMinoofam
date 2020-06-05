package com.company;

public class Entity {
private int id,age;
private String name,fathername,city,takhasos;
public int getId(){return id;}
public int getAge(){return age;}
public Entity setId(int id) {
    this.id=id ;
    return this;}
             public Entity setAge(int age){
    this.age=age;
    return this;
             }
             public String getName(){return name;}
             public String getfathername(){return fathername; }
             public String getCity(){return city;}
             public String getTakhasos(){return takhasos;}
             public Entity setName(String name){
    this.name=name;
    return this;
             }
             public Entity setFathername(String fathername){
    this.takhasos=takhasos;
    return this;
             }
             public Entity setCity(String city){
    this.city=city;
    return this;
             }
             public Entity setTakhasos(String takhasos){
    this.takhasos=takhasos;
    return this;
             }


}
