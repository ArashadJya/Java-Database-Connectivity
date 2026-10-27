/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.callablestatedemopart7;

/**
 *
 * @author arash
 */
import java.sql.*;
public class SecondDemo {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
        CallableStatement cs=con.prepareCall("{call getEmpData(?)}");
        cs.setInt(1, 1);
        ResultSet rs=cs.executeQuery();
        while(rs.next()){
            System.out.println("Name "+rs.getString(1));
            System.out.println("Email "+rs.getString(2));
            System.out.println("-----------------------");
        }
    }
    
}
