

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arash
 */import java.sql.*;
public class firstDemo {
    public static void main(String[] args)  throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
        CallableStatement cs=con.prepareCall("{?=call getAvgSalary()}");
        cs.registerOutParameter(1, Types.INTEGER);
        cs.execute();
        System.out.println(cs.getInt(1));
        con.close();
    }
    
}
