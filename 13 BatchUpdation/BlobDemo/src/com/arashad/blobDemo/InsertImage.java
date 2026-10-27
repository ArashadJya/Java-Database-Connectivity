/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arashad.blobDemo;

/**
 *
 * @author arash
 */
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class InsertImage {
    public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lobdemo","root","44@@");
        
        PreparedStatement ps=con.prepareStatement("insert into blobdemo values(?,?)");
        ps.setString(1, "Arashad");
        FileInputStream fis=new FileInputStream("C:\\Users\\arash\\OneDrive\\Desktop\\core java practice\\OIP.jpg");
        ps.setBinaryStream(2, fis);
        int rowcount =ps.executeUpdate();
        if(rowcount>0){
            System.out.println("Image inserted sucessfully");
        }
        else{
            System.out.println("image not inserted");
        }
        
    }
    
}
