package com.company;

public class Entity {
    private String name,familyname,fathername;
public String getName(){ return name;}
public String getFamilyname(){return familyname;}
public String getFathername(){return fathername;}
public Entity setName(String name){this.name=name; return this;}
public Entity setFamilyname(String familyname){this.familyname=familyname; return this;}
public Entity setFathername(String fathername){this.fathername= fathername; return this;}

}
