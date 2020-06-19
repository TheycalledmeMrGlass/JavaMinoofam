package com.company;

import java.io.Serializable;

public class Entity implements Serializable {
    private int id;
    private String username,password;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Entity setId(int id) {
        this.id = id;
        return this;
    }

    public Entity setUsername(String username) {
        this.username = username;
        return this;
    }

    public Entity setPassword(String password) {
        this.password = password;
        return this;
    }
}
