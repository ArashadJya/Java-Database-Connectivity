
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arash
 */
public class TryCatchFinally {
     public static void main(String[] args) {
        System.out.println("1");
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select*from register");
            while(rs.next()){
                System.out.print(rs.getString(1)+","+rs.getString(2));
                System.out.println("");
            }
           
        }
        catch(ClassNotFoundException| SQLException e){
            System.out.println(e);
        }
        finally{
            try{
                 con.close();
                 System.out.println("2");
            System.out.println("connection close sucessfully");
            }
            catch(SQLException|NullPointerException e){
                System.out.println(e);
            }
            
        }
        System.out.println("3");
    }
    
}
