/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllQueriesDemo;

/**
 *
 * @author arash
 */
import java.sql.*;
public class InsertDemo {
    public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
        Statement st=con.createStatement();
       int rowcount= st.executeUpdate("insert into register values('Arashad','arashad@gmail.com','male','81')");
        System.out.println("rowcount "+rowcount);
       if(rowcount==0){
           System.out.println("value not inserted");
       }
       else{
           System.out.println("value inserted sucessfully");
       }
    }
    
}
