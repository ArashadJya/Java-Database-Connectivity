
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arash
 */
public class secondDemo {
    public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","44@@");
        String sql_query="select*from student ";
        PreparedStatement ps=con.prepareStatement(sql_query,ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
       
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            System.out.print(rs.getString(1));
            System.out.print(","+rs.getString(2));
            System.out.print(","+rs.getString(3));
            System.out.print(","+rs.getString(4));
            System.out.println("");
        }
      
//        if(rowcount>0){
//            System.out.println("data reterive sucessfull");
//        }
//        else{
//            System.out.println("not sucessfull");
//        }
    }
    
}


