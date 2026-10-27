/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arashad.BankApp;


/**
 *
 * @author arash
 */
import java.sql.*;
public class DbConnection {
    static  Connection con;
    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankApp","root","44@@");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    static  Connection getConnect(){
        return con;
    }
    
}
