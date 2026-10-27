/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arashad.clobdemo;

/**
 *
 * @author arash
 */
import java.io.FileReader;
import java.sql.*;
public class InsertTextFile {
    public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lobdemo","root","44@@");
        
        PreparedStatement ps=con.prepareStatement("insert into clobdemo values(?,?)");
        ps.setString(1, "Arashad");
        FileReader fr=new FileReader("C:\\Users\\arash\\OneDrive\\Desktop\\New folder\\New Text Document.txt");
        
        ps.setCharacterStream(2, fr);
        
        int rowcount=ps.executeUpdate();
        if(rowcount>0){
            System.out.println("file insert sucessfully");
        }
        else{
            System.out.println("File not inserted");
        }
    }
    
}
