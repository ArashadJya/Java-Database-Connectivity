/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcPart6;

/**
 *
 * @author arash
 */
import java.sql.*;
import java.sql.PreparedStatement;
public class firstDemo {
    public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","44@@");
        PreparedStatement ps=con.prepareStatement("insert into student value(?,?,?,?)");   //this is a sql formate
        //preparedStatement is a interface and prepareStatement is method of connection interface 
        ps.setString(1, "Ekra");
        ps.setInt(2, 11);
        ps.setInt(3, 04);
        ps.setString(4, "Janta Inter College");
        int rowcount=ps.executeUpdate();
        if(rowcount==0){
            System.out.println("Insertion not sucessfully");
        }
        else{
            System.out.println(" first row Insertion sucessfully");
        }
          ps.setString(1, "Mansi");
        ps.setInt(2, 12);
        ps.setInt(3, 04);
        ps.setString(4, "LIT");
        int rowcount1=ps.executeUpdate();
        System.out.println("rowcount1 "+rowcount1);
        if(rowcount1>0){
            System.out.println("second row insertion sucessfully");
        }
        else{
            System.out.println("Insertion not sucessfully");
    }
    }
}
    
