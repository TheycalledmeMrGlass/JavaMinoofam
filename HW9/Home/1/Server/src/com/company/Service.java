package com.company;
import java.util.*;
import java.rmi.*;
public interface Service extends Remote{
    void save(Entity entity)throws Exception;
    void edit(Entity entity)throws Exception;
    List<Entity> report()throws Exception;
}
