/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg18.connectionpoolingpart16;

/**
 *
 * @author arash
 */
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;
 class mysqlDataSourcedemo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)throws Exception{
        MysqlDataSource ds=new MysqlDataSource();
        ds.setURL("jdbc:mysql://localhost:3306/lobdemo");
        ds.setUser("root");
        ds.setPassword("44@@");
        
        Connection con=ds.getConnection();
        
        PreparedStatement ps=con.prepareStatement("select*from clobdemo");
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getString(2));
        }
        // TODO code application logic here
    }
    
}
