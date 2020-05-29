package com.company;

public class Entity {
    public String model;
    public String name;
    public int price;
    public int id;
    public int getPrice(){return id;}
    public int getId(){return price;}
    public String getModel(){return model;}
    public String getName(){return name;}
    public void setPrice(int price){this.price=price;}
    public void setName(String name){this.name=name;}
    public void setId(int id){this.id=id;}
    public void setModel(String model){this.model=model;}
}
