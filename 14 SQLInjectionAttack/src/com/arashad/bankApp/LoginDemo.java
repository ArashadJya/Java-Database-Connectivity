/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arashad.bankApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;

/**
 *
 * @author arash
 */
public class LoginDemo {
    public static void main(String[] args) throws Exception{
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Email");
        String email1=sc.nextLine();
        System.out.println("Enter a password");
        String pass1=sc.nextLine();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankApp","root","44@@");
       PreparedStatement ps=con.prepareStatement("select name from Login where email=? and password=?");
       ps.setString(1, email1);
       ps.setString(2, pass1);
       
       ResultSet rs=ps.executeQuery();
        
       if(rs.next()){
           System.out.println("Hi "+rs.getString(1));
       }
       else{
           System.out.println("Email and password id not matched");
       }
    }
    
}
