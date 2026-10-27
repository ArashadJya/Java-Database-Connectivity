/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcPart6;

/**
 *
 * @author arash
 */
import java.util.Scanner;
import java.sql.*;
public class selectDemo {
    public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","44@@");
        PreparedStatement ps=con.prepareStatement("select*from student where name=?");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a name");
        String name=sc.nextLine();
        ps.setString(1, name);
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
