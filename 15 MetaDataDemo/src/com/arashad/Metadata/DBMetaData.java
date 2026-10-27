/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arashad.Metadata;

/**
 *
 * @author arash
 */
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
public class DBMetaData {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankApp","root","44@@");
        DatabaseMetaData md= con.getMetaData();
        System.out.println(md.getDatabaseProductName());  //it returns the database name
        System.out.println(md.getDatabaseProductVersion());//it returns the database version name
        System.out.println(md.getDatabaseMajorVersion()); //it return the database version name
        System.out.println(md.getDatabaseMinorVersion());//it return the database minor version name
        System.out.println(md.getSQLKeywords());   //it return the all sql keywords that we have used
        System.out.println(md.supportsBatchUpdates());//it checks the mysql support or not to the batchupdates
        
                
    }
}
