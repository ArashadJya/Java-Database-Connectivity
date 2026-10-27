/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batchupdation;
import java.sql.*;
/**
 *
 * @author arash
 */
public class secondDemo {
    public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
        PreparedStatement ps=con.prepareStatement("insert into items values(?,?)");
        
        ps.setInt(1, 101);
        ps.setString(2, "aaa");
        ps.addBatch();
        
        ps.setInt(1, 102);
        ps.setString(2, "bbb");
        ps.addBatch();
       
        
        int[] rowcount= ps.executeBatch();
        for(int i:rowcount){
            System.out.println("row manipulayted "+i);
        }
        
        
    }
    
}
