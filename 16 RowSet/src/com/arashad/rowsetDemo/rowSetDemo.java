/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arashad.rowsetDemo;

/**
 *
 * @author arash
 */
import javax.sql.rowset.RowSetProvider;
import javax.sql.RowSet;
public class rowSetDemo {
    public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        RowSet rs=RowSetProvider.newFactory().createJdbcRowSet();
        rs.setUrl("jdbc:mysql://localhost:3306/email");
        rs.setUsername("root");
        rs.setPassword("44@@");
        
        rs.setCommand("select*from register");
        rs.execute();
        
        while(rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getString(2));
        }
        
    }
    
}
