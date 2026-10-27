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
public class selectData {
    void getData(){
        try{
            DBConnection db=new DBConnection();
            Connection con=db.getConnection();
            PreparedStatement ps=con.prepareStatement("select* from register");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                System.out.println("--------------------------------");
            }
        }
        catch(Exception e){
            
        }
    }
    
    
}
