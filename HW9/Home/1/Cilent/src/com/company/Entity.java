package com.company;

import java.io.Serializable;

public class Entity implements Serializable {
    private int id;
    private String user,pass;
    public int getId(){return id;}
    public String getUser(){return user;}
    public String getPass(){return pass;}
public Entity setId(int id){this.id=id;return this;}
public Entity setUser(String user){this.user=user;return this;}
public Entity setPass(String pass){this.pass=pass;return this;}

}
