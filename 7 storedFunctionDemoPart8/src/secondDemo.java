/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arash
 */
import java.util.Scanner;
import java.sql.*;
public class secondDemo {
    public static void main(String[] args)throws Exception{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
       CallableStatement cs=con.prepareCall("{?=call getEmpName(?)}");
       Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a id number");
        int a=sc.nextInt();
       cs.setInt(2, a);
       cs.registerOutParameter(1, Types.VARCHAR);
       cs.execute();
        System.out.println(cs.getString(1));
        con.close();
    }
}
