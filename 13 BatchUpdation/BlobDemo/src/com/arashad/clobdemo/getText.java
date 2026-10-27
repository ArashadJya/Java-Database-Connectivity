/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arashad.clobdemo;

/**
 *
 * @author arash
 */
import java.io.Reader;
import java.io.FileWriter;
import java.sql.*;
public class getText {
    public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lobdemo","root","44@@");
        
        PreparedStatement ps=con.prepareStatement("select* from clobdemo");
        ResultSet rs=ps.executeQuery();
        rs.next();
        
        System.out.println(rs.getString(1));
        
       Reader re=rs.getCharacterStream(2);
        FileWriter fw=new FileWriter("C:\\Users\\arash\\OneDrive\\Desktop\\New folder\\New Text Document (2).txt");
        int i=0;
        while((i=re.read())!=-1){
            System.out.print((char)i);
            fw.write((char)i);
        }
        fw.close();
    }
    
}
