
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arash
 */
public class ThirdDemo {
    public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","44@@");
        String sql_query="select*from student ";
        PreparedStatement ps=con.prepareStatement(sql_query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs=ps.executeQuery();
            System.out.println("Print the recorde in a forward directioin");
//        while(rs.next()){
//            System.out.print(rs.getString(1));
//            System.out.print(","+rs.getString(2));
//            System.out.print(","+rs.getString(3));
//            System.out.print(","+rs.getString(4));
//            System.out.println("");
//        }
        System.out.println("---------------------------------");
        System.out.println("Print the record in a backward direction");
        while(rs.previous()){
            System.out.print(rs.getString(1));
            System.out.print(","+rs.getString(2));
            System.out.print("'"+rs.getString(3));
            System.out.print("'"+rs.getString(4));
            System.out.println("");
        }
      
//        if(rowcount>0){
//            System.out.println("data reterive sucessfull");
//        }
//        else{
//            System.out.println("not sucessfull");
//        }
    } 
}
//agar ham kewal previous() method use karte hai to program output nahi hoga because previous() me cursor last row se backword move
//hona suru hota hai but cursor bu default to starting of first row me hota hai isliye pahle hame cursor ko last wale row par set karna padega 
