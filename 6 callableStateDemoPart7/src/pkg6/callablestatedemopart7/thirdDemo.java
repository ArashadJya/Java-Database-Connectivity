/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6.callablestatedemopart7;

/**
 *
 * @author arash
 */import java.sql.*;
public class thirdDemo {
    public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
        
        CallableStatement cs=con.prepareCall("{ call getEmpName(?,?)}");
        cs.setInt(1, 2);
        
        cs.registerOutParameter(2, Types.VARCHAR);
        cs.execute();
        System.out.println("Name "+cs.getString(2));
//       
        con.close();
    }
    
    
}
