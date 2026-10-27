/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllQueriesDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author arash
 */
public class UpdateDemo {
     public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
        Statement st=con.createStatement();
       int rowcount= st.executeUpdate("update register set Gender='Male' where name='Ekra'");
       if(rowcount==0){
           System.out.println("Update not sucess");
       }
       else{
           System.out.println("value update sucessfully");
       }
    }
}
