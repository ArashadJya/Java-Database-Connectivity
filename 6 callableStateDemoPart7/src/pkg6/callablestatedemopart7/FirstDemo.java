/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.callablestatedemopart7;

/**
 *
 * @author arash
 */
import java.sql.*;
public class FirstDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
        
        CallableStatement cs=con.prepareCall("{call getAllEmpData()}");
        
        cs.execute();
        ResultSet rs=cs.getResultSet();
        while(rs.next()){
            System.out.println("Name "+rs.getString(1));
            System.out.println("Email "+rs.getString(2));
            System.out.println("Id "+rs.getString(4));
            System.out.println("Gender "+rs.getString(3));
            System.out.println("-------------------------------------------------------");
        }
        con.close();
    }
    
}
