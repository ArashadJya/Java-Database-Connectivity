
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arash
 */
public class TryWithResources {
    public static void main(String[] args) {
           System.out.println("1");
           try{
            Class.forName("com.mysql.cj.jdbc.Driver");
               
           }
           catch(ClassNotFoundException e){
               
           }
        try(
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
                Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select*from register");
                )
            //agar ham try with resources ke andar koi bhi resources  likhte hai to usko alag se close karne ki need nahi padti wo khud se close bhi kar deta hai 
        {
            while(rs.next()){
                System.out.print(rs.getString(1)+","+rs.getString(2));
                System.out.println("");
            }
           
        }
        catch( SQLException e){
            System.out.println(e);
        }
      
        System.out.println("3");
    }
    
}

    
    

