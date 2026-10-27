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
import java.io.FileOutputStream;
import java.io.InputStream;

import java.sql.*;
public class getImage {
    public static void main(String[] args)  throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lobdemo","root","44@@");
        
        PreparedStatement ps=con.prepareStatement("select * from blobdemo");
        ResultSet rs=ps.executeQuery();
        rs.next();
        System.out.println(rs.getString(1));
        
        FileOutputStream fos=new FileOutputStream("C:\\Users\\arash\\OneDrive\\Desktop\\New folder\\New Text Document.txtS");
        InputStream is=rs.getBinaryStream(2);
        int val=0;
        while((val=is.read())!=-1){
            fos.write(val);
        }
        System.out.println("Imaged saved sucessfully");
                
        
    }
    
}
