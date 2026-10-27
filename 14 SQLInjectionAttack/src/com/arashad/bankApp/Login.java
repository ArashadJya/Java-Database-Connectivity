/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arashad.bankApp;

/**
 *
 * @author arash
 */
import java.util.Scanner;
import java.sql.*;
public class Login {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Email");
        String email1=sc.nextLine();
        System.out.println("Enter a password");
        String pass1=sc.nextLine();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankApp","root","44@@");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select* from Login where email='"+email1+"' and password='"+pass1+"'");
       if(rs.next()){
           System.out.println("Hi "+rs.getString(1)+" "+rs.getString(2));
       }
       else{
           System.out.println("Email and password id not matched");
       }
        
    }
    
}
