/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arashad.methodapproach;

/**
 *
 * @author arash
 */
import java.sql.*;
public class DBConnection {
    Connection con;
    Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
}
