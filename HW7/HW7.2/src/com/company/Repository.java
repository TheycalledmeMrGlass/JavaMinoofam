package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Repository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public Repository()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","buyer","myjava123");
        connection.setAutoCommit(false);
    }
    public void insert(Entity sell1)throws Exception{
        PreparedStatement preparedStatement=connection.prepareStatement("insert into sell(model,name,price,id)values (?,?,?,?)");
        preparedStatement.setString(1,sell1.getModel());
        preparedStatement.setString(2,sell1.getName());
        preparedStatement.setInt(3,sell1.getPrice());
        preparedStatement.setInt(4,sell1.getId());
        preparedStatement.executeUpdate();
        choosing(sell1);
    }
public void choose(Entity sell2)throws Exception{
        PreparedStatement preparedStatement=connection.prepareStatement("select * from sell where id=?");
        preparedStatement.setInt(1,sell2.getId());
    ResultSet resultSet=preparedStatement.executeQuery();
    if(resultSet.next()){
        System.out.println("ghablan mashin kharide id");
        System.exit(0);
    }else{
        System.out.println("vared shavid"+resultSet.getString("The name"));
    }
}
public void choosing(Entity sell1)throws Exception{
        PreparedStatement preparedStatement=connection.prepareStatement("select * from selling");
        ResultSet resultSet=preparedStatement.executeQuery();
    List<Entity>entityList=new ArrayList<>();
while (resultSet.next()){
    Entity name=new Entity();
    name.setModel(resultSet.getString("model"));
name.setName(resultSet.getString("name"));
name.setPrice(resultSet.getInt("price"));
name.setId(resultSet.getInt("id"));
entityList.add(name);
}

}
    public void commit() throws Exception{
        connection.commit ();
    }
    public void rollback() throws Exception{
        connection.rollback ();
    }
    @Override
    public void close() throws Exception {
        preparedStatement.close ();
        connection.close ();
    }
}
