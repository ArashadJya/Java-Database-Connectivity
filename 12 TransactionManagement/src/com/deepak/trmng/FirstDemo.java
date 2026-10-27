/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deepak.trmng;

/**
 *
 * @author arash
 */
import java.sql.*;
public class FirstDemo {
    public static void main(String[] args) throws Exception{
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
        con.setAutoCommit(false);
        Statement st=con.createStatement();
        
        int rowcount1=st.executeUpdate("insert into items values(101,'Arashad')");
        int rowcount2=st.executeUpdate("insert into items values(102,'jya')");
        int rowcount3=st.executeUpdate("insert into items values(103,'khan')");
        int rowcount4=st.executeUpdate("insert into items values('ramu',104)");
        
        if(rowcount1>0 &&rowcount2>0 &&rowcount3>0 &&rowcount4>0){
            con.commit();
            System.out.println("Items added sucessfully");
        }
       
        }
        catch(Exception e){
            try{
                System.out.println("Items insertion failed");
                 con.rollback();
            }
            catch(SQLException es){
                System.out.println(es);
            }
            System.out.println(e);
        }
    }
    
}
