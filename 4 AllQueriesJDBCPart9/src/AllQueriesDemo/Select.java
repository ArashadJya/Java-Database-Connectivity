/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AllQueriesDemo;

/**
 *
 * @author arash
 */
import java.sql.*;
public class Select {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws Exception{
        // TODO code application logic here
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select*from register");
        while(rs.next()){
            System.out.print(rs.getString(1));
            System.out.print(rs.getString(2));
            System.out.print(rs.getString(3));
            System.out.print(rs.getString(4));
            System.out.println();
        }
    }
    
}
