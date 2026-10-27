/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package batchupdation;

/**
 *
 * @author arash
 */import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class firstDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","44@@");
        Statement st=con.createStatement();
         st.addBatch("insert into items values(101,'Arashad')");
        st.addBatch("insert into items values(102,'sibu')");
        st.addBatch("insert into items values(103,'jya')");
        st.addBatch("insert into items values(104,'khan')");
        st.addBatch("insert into items values(105,'Arashad')");
        
        int[] rowcount=st.executeBatch();
        for(int i:rowcount){
            System.out.println(i+"row manipulkated");
        }
        con.close();
    }
    
}
