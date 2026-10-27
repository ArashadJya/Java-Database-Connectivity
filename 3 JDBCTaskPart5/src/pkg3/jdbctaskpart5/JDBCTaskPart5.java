/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.jdbctaskpart5;

//import com.mysql.jdbc.Driver;

/**
 *
 * @author arash
 */
import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.util.Scanner;
//import java.sql.ResultSet;


public class JDBCTaskPart5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded sucessfully");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
        Statement st=con.createStatement();
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Name");
        String name=sc.nextLine();
        
        System.out.println("Enter email");
        String email=sc.nextLine();
        
        System.out.println("Enter Gender");
        String Gender=sc.nextLine();
        
        System.out.println("Enter id");
        int id=sc.nextInt();
        
       
        String sql_Query="insert into register values( '"+name+"','"+email+"','"+Gender+"','"+id+"' )";
        
      int rowcount=  st.executeUpdate(sql_Query);
//    executeUpdate()  Ye ek integer return karta hai, jo batata hai ki kitne rows database mein affected hue (e.g., kitne rows insert, update, ya delete hue).
      if(rowcount>0){
          System.out.println("Values inserted sucessfully");
      }
      else{
          System.out.println("value insertion failed");
      }
      con.close();
      
      Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
      Statement st1=con1.createStatement();
      ResultSet rs=st1.executeQuery("select*from register");
      while(rs.next()){
          System.out.print(rs.getString(1));
          System.out.print(","+rs.getString(2));
          System.out.print(","+rs.getString(3));
          System.out.print(","+rs.getString(4));
          System.out.println("");
      }
      con1.close();
      sc.close();
        
    }
    
    
}
