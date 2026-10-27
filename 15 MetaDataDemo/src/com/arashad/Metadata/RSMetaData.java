/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arashad.Metadata;

/**
 *
 * @author arash
 */
import java.sql.*;
public class RSMetaData {
    public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankApp","root","44@@");
        PreparedStatement ps=con.prepareStatement("select * from Login");
        ResultSet rs=ps.executeQuery();
       ResultSetMetaData md= rs.getMetaData();
        System.out.println(md.getColumnCount());  //it count the column
        System.out.println(md.getColumnName(1));  //it returns name of first column
        System.out.println(md.getColumnTypeName(1));// it return the datatype of specific column
        System.out.println(md.getColumnDisplaySize(1)); //it display the size of specific column
        System.out.println(md.getTableName(1));        //it returns the table name 
    }
}
