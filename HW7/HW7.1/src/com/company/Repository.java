package com.company;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Repository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    Entity x=new Entity();
    public Repository()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","user1","myjava123");
        connection.setAutoCommit(false);

    }
    public List<Entity>select(Entity resultset)throws Exception{
        preparedStatement=connection.prepareStatement("select * from foruser");
        ResultSet resultSet=preparedStatement.executeQuery();
        List<Entity> entityList=new ArrayList<>();
        while(resultSet.next()){
            Entity entity=new Entity();
            entity.setId(resultSet.getInt("id"));
            entity.setusername(resultSet.getString("username"));
            entity.setpassword(resultSet.getInt("password"));
            entityList.add(entity);
        }
        if(resultSet.next()){
            System.out.println("username and password are both correct");
        }
        else{
            System.out.println("the user doesn't exist");
            System.exit(0);
        }
        return entityList;
    }
    public void insert(Entity entity)throws Exception{
        preparedStatement=connection.prepareStatement("Insert into foruser(username,password)values (?,?)");
        preparedStatement.setString(1,entity.getUsername());
        preparedStatement.setInt(2,entity.getPassword());
        preparedStatement.executeUpdate();
    }
    public void update(Entity entity)throws Exception{
        PreparedStatement preparedStatement=connection.prepareStatement("update foruser SET username=? ,SET password=?, where id=?");
        preparedStatement.setString(1,entity.getUsername());
        preparedStatement.setInt(2,entity.getPassword());
        preparedStatement.executeUpdate();
    }
    public void delete(int id)throws Exception{
       preparedStatement=connection.prepareStatement("delete from foruser where id=?");
       preparedStatement.setInt(1,id);
       preparedStatement.executeUpdate();
    }
    public void commit()throws Exception{
        connection.commit();
    }
    public void rollback()throws Exception{
        connection.rollback();
    }


    @Override
    public void close() throws Exception {
preparedStatement.close();
connection.close();
    }
}
