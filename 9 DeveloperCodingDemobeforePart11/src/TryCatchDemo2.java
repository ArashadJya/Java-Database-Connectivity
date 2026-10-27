/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
public class TryCatchDemo2 {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select*from register");
            while(rs.next()){
                System.out.print(rs.getString(1)+","+rs.getString(2));
                System.out.println("");
            }
            con.close();
            System.out.println("connection close sucessfully");
            
        }
        catch(ClassNotFoundException| SQLException e){
            System.out.println(e);
        }
        System.out.println("2");
    }
}
