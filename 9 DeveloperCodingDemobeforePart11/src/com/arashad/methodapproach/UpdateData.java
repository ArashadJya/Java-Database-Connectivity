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
public class UpdateData {
    void updateData(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
            PreparedStatement ps=con.prepareStatement("update register set name='khan' where id='1' ");
            int i=ps.executeUpdate();
            if(i>0){
                System.out.println("value update sucessfully");
            }
            else{
                System.out.println("failed");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
