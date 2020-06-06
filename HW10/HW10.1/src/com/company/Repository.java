package com.company;
import java.util.*;
import java.sql.*;
public class Repository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public Repository()throws Exception{
      Class.forName("oracle.jdbc.OracleDriver");
      connection=DriverManager.getConnection("oracle:jdbc:thin:@localhost:1521:xe","loginperson","myjava123");
connection.setAutoCommit(false);
    }
    public void insert(Entity entity)throws Exception{
preparedStatement=connection.prepareStatement("insert into ourinfo(name,familyname,fathername)values (?,?,?)");
preparedStatement.setString(1,entity.getName());
preparedStatement.setString(2,entity.getFamilyname());
preparedStatement.setString(3,entity.getFathername());
preparedStatement.executeUpdate();
        System.out.println("saved");
    }
    public List<Entity>select()throws Exception{
preparedStatement=connection.prepareStatement("select * from ourinfo");
ResultSet resultSet=preparedStatement.executeQuery();
List<Entity>entities=new ArrayList<>();
while(resultSet.next()){
Entity entity=new Entity();
entity.setName(resultSet.getString("name"));
entity.setFamilyname(resultSet.getString("familyname"));
entity.setFathername(resultSet.getString("fathername"));
entities.add(entity);
}
return entities;
    }
    public void commit()throws Exception{
        connection.commit();
    }
    public void rollback()throws Exception{
        connection.rollback();
    }
    @Override
    public void close()throws Exception{
        preparedStatement.close();
        connection.close();
    }
}
