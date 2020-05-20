package com.company;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args)throws Exception {
        Employee e=new Employee();
        Scanner input=new Scanner(System.in);
Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle","amir","java123");
        connection.setAutoCommit(false);
        PreparedStatement preparedStatement=connection.prepareStatement("insert into person(id,name,melicode)values(?,?,?)");
        preparedStatement.setInt(1 ,e.id=input.nextInt());
        preparedStatement.setInt(2, Integer.parseInt(e.name=input.nextLine()));
        preparedStatement.setInt(3,e.meilcode=input.nextInt());
        System.out.println("inserted"+preparedStatement.executeUpdate());
        PreparedStatement preparedStatement1=connection.prepareStatement("insert into person1(fathername,position,payment)values (?,?,?)");
        preparedStatement1.setString(1,e.fathername=input.nextLine());
        preparedStatement1.setString(2,e.position=input.nextLine());
        preparedStatement1.setInt(3,e.payment=input.nextInt());
    PreparedStatement preparedStatement2=connection.prepareStatement("insert into person2(lastpositions)values (?)");
    preparedStatement2.setString(1,e.lastpositions);
        System.out.println("enter the id");
        if(e.id!=1){
            PreparedStatement preparedStatement3=connection.prepareStatement("delete from person where id=?"){
                preparedStatement3.setInt(1,e.id);

                preparedStatement3.setInt(3,e.payment);
                System.out.println("deleted"+preparedStatement3.executeUpdate());
            }
        }
    connection.commit();
    preparedStatement.close();
    preparedStatement1.close();
    preparedStatement2.close();
    connection.close();

	// write your code here
    }
}
