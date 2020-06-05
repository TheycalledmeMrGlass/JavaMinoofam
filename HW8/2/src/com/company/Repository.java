package com.company;

import java.sql.*;
import java.util.*;

public class Repository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
public static List<String> users=new ArrayList<>();
public static List<String > passes=new ArrayList<>();
public Repository()throws Exception{
    Class.forName("oracle.jdbc.driver.OracleDriver");
connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","myusers1","myjava123");
connection.setAutoCommit(false);
}
public void insert(Entity entity)throws Exception{
preparedStatement=connection.prepareStatement("insert into myusers(id,name,username,password,email)values (?,?,?,?,?)");
preparedStatement.setInt(1,1);
preparedStatement.setString(2,"mammad");
preparedStatement.setString(3,"mammad12");
preparedStatement.setString(4,"123");
preparedStatement.setString(5,"mammad@yahoo");
preparedStatement.executeUpdate();
preparedStatement=connection.prepareStatement("insert into myusers(id,name,username,password,email)values (?,?,?,?,?)");
preparedStatement.setInt(1,2);
preparedStatement.setString(2,"reza");
preparedStatement.setString(3,"reza123");
preparedStatement.setString(4,"1345");
preparedStatement.setString(5,"reza@yahoo");
preparedStatement.executeUpdate();
preparedStatement=connection.prepareStatement("insert into myusers(id,name,username,password,email)values (?,?,?,?,?)");
preparedStatement.setInt(1,3);
preparedStatement.setString(2,"ali");
preparedStatement.setString(3,"ali132");
preparedStatement.setString(4,"1455");
preparedStatement.setString(5,"ali@gmail");
preparedStatement.executeUpdate();
}
public void update(Entity entity)throws Exception{
preparedStatement=connection.prepareStatement("update myusers set name=? username=? password=? email=? where id=?");
    preparedStatement.setString(1,entity.getName());
    preparedStatement.setString(2,entity.getUsername());
    preparedStatement.setString(3,entity.getPassword());
    preparedStatement.setString(4,entity.getEmail());
    preparedStatement.setInt(5,entity.getId());
    preparedStatement.executeUpdate();
}
public List<Entity>select()throws Exception{
preparedStatement=connection.prepareStatement("select * from myusers");
ResultSet resultSet=preparedStatement.executeQuery();
List<Entity>entityList=new ArrayList<>();
while(resultSet.next()){
    Entity entity = new Entity();
    entity.setId(resultSet.getInt("id"));
    entity.setName(resultSet.getString("name"));
    entity.setUsername(resultSet.getString("username"));
    entity.setPassword(resultSet.getString("password"));
    entity.setEmail(resultSet.getString("email"));
    entityList.add(entity);
users.add(resultSet.getString("username"));
passes.add(resultSet.getString("password"));
}
return entityList;
}
    public void commit() throws Exception {
        connection.commit ();
    }
    public void rollback() throws Exception {
        connection.rollback ();
    }
    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
