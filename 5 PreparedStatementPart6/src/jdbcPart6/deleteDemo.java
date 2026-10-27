/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcPart6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author arash
 */
public class deleteDemo {
    public static void main(String[] args)throws Exception{
         Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","44@@");
        PreparedStatement ps=con.prepareStatement("delete from student where name=?");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a name");
        String name=sc.nextLine();
        ps.setString(1, name);
        
        int rowcount =ps.executeUpdate();
        if(rowcount>0){
            System.out.println("deletion sucessfull");
        }
        else{
            System.out.println("Deletion not sucessfull");
        }
    }
    
}
