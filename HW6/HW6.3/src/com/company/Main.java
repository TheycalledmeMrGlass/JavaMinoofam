package com.company;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args)throws Exception {
	// write your code here
        Scanner input=new Scanner(System.in);
        Student s=new Student();
      Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection= DriverManager.getConnection("jdbc:oracle:thin:1521:xe","reza","java123");
        connection.setAutoCommit(false);
        PreparedStatement preparedStatement=connection.prepareStatement("insert into person(id,name,entranceYear,avg)values (?,?,?,?)");
        preparedStatement.setInt(1,s.id=input.nextInt());
        preparedStatement.setString(2,s.name=input.next());
        preparedStatement.setInt(3,s.entranceYear=input.nextInt());
        preparedStatement.setInt(4,s.avg=input.nextInt());
        System.out.println("inserted"+preparedStatement.executeUpdate());
        connection.commit();
        PreparedStatement preparedStatement1=connection.prepareStatement("update person set name=? WHERE id=? ");
        preparedStatement1.setInt(1,s.id=input.nextInt());
        preparedStatement1.setString(2,s.name=input.nextLine());
        System.out.println("updated"+preparedStatement1.executeUpdate());
connection.commit();
preparedStatement.close();
preparedStatement1.close();
connection.close();
    }
}
