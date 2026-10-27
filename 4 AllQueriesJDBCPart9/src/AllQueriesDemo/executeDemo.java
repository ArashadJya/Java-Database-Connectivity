/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllQueriesDemo;

/**
 *
 * @author arash
 */
import java.sql.*;
import java.util.Scanner;
public class executeDemo {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
        Statement st=con.createStatement();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a query");
        String ssql_query=sc.nextLine();
       boolean b= st.execute(ssql_query);
       
       if(b){
           ResultSet rs=st.getResultSet();
//           this method is used to get statemet object in the form of result set
           while(rs.next()){
               System.out.print(rs.getString(1));
               System.out.print(","+rs.getString(2));
               System.out.print("'"+rs.getString(3));
               System.out.print("'"+rs.getString(4));
               System.out.println("");
           }
       }
       else{
           int rowCount=st.getUpdateCount();
//           this method is used to the count that how many row will be affected
           if(rowCount==0){
               System.out.println("failed");
           }
           else{
               System.out.println("sucess");
           }
       }
        
    }
    
    
}
