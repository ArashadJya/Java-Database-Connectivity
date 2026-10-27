
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * is program me data insert kiya gaya hai bina insert command ke
 */
public class eightDemo {
      public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
        String sql_query="select*from register  ";
        PreparedStatement ps=con.prepareStatement(sql_query,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=ps.executeQuery();
        
        // move rs cursor to insert position 
        rs.moveToInsertRow();
        
        //provide value which you want to insert with column index position and value
        rs.updateString(2, "hamid@gmail.com");
        rs.updateString(1, "Hamid");
        rs.updateString(3, "male");
        rs.updateInt(4, 12);
        
        rs.insertRow();
          System.out.println("Row inserted sucessfully");
    } 
}
