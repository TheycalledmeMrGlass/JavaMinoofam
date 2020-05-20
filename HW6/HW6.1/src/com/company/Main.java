package com.company;

import java.lang.Class;
import java.lang.String;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
Scanner input=new Scanner(System.in);
        User u=new User();
        try(Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","farzad","java123")){
    Class.forName("oracle.jdbc.driver.OracleDriver");

    PreparedStatement preparedStatement=connection.prepareStatement("insert into person(idcode,username,email)values(?,?,?) ");
    preparedStatement.setInt(1,123);
    preparedStatement.setString(2,"farhad");
    preparedStatement.setString(3,"farhad79");
            System.out.println("Insert into Db"+preparedStatement.executeUpdate());
            System.out.println("if not, enter your favourite variables");

            PreparedStatement preparedStatement1=connection.prepareStatement("update  person set name =? WHERE id=? or  id=? or id=?");
            preparedStatement1.setInt(1,u.idcode=input.nextInt());
            preparedStatement1.setString(2,u.username=input.next());
            preparedStatement1.setString(3,u.email=input.next());
            System.out.println("Updated"+preparedStatement1.executeUpdate());

            PreparedStatement preparedStatement2=connection.prepareStatement("insert into person1(password,age,education)values (?,?,?)");
            preparedStatement2.setInt(1,1234);
            preparedStatement2.setInt(2,23);
            preparedStatement2.setString(3,"Diploma");
            System.out.println("Inserted into DB"+preparedStatement2.executeUpdate());

            System.out.println("if not, enter your favourite variables");

            PreparedStatement preparedStatement3=connection.prepareStatement("update person1 set name=? WHERE id=? or id=? or id=?");
            preparedStatement3.setInt(1,u.password=input.nextInt());
            preparedStatement.setInt(2,u.age=input.nextInt());
            preparedStatement3.setString(3,u.education=input.next());
            System.out.println("updated"+preparedStatement3.executeUpdate());
            connection.commit();
            preparedStatement.close();
            preparedStatement1.close();
            preparedStatement2.close();
            preparedStatement3.close();
            connection.close();



} catch (SQLException e) {
            e.printStackTrace();
            System.out.println("DB Driver doesnt exsist"+e.getMessage());
        }catch (ClassNotFoundException f){
            System.out.println("DB Does not exist");
        }

        // write your code here
    }
}
