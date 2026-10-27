
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
 * we can update the specific fields of specific row without update commands
 */
public class ninthDemo {
     public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
        String sql_query="select*from salary  ";
        PreparedStatement ps=con.prepareStatement(sql_query,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=ps.executeQuery();
        
        //we can set the cursor on specific number of row
        rs.absolute(3);
        
//        it set the value of  3rd  number field of specific row
        rs.updateInt(3, 10);
        
//       this method is used to the update the row
        rs.updateRow();
          System.out.println("Row update sucessfully");
    } 
}

    

