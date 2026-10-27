/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcdemo2;

/**
 *
 * @author arash
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class JDBCDEmo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws ClassNotFoundException,SQLException{
        // TODO code application logic here
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email", "root", "44@@");
        System.out.println("connection between java and database is sucessfull ");
        
        Statement st=con.createStatement();
       ResultSet rs = st.executeQuery("select name,email,id from register");
        while(rs.next()){
            System.out.print(rs.getString(1)+",");
            System.out.print(rs.getString(2)+",");
            System.out.print(rs.getString(3)+",");
//            System.out.print(rs.getString(4)+",");
            System.out.println();
        }
    }
    
}
