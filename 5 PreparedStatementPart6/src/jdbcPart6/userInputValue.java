/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcPart6;

/**
 *
 * @author arash
 */
import java.sql.*;
import java.util.Scanner;
public class userInputValue {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","44@@");
        PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter name");
            String name=sc.nextLine();
            System.out.println("Enter class");
            int classs=sc.nextInt();
            System.out.println("Enter roll number");
            int roll_no=sc.nextInt();
            sc.nextLine();
            //agar ham integer ke baad string ka input lete hai sc.nextLine() ek extra lagana padta hai
            System.out.println("enter a college");
            String college=sc.nextLine();
            
            ps.setString(1, name);
            ps.setInt(2, classs);
            ps.setInt(3, roll_no);
            ps.setString(4, college);
            
            int rowcount=ps.executeUpdate();
            if(rowcount>0){
                System.out.println("insertion sucessfull");
            }
            else{
                System.out.println("Insertion not sucessfull");
            }
            System.out.println("dou you want to continue?(y/n)");
            String output=sc.next();
            sc.nextLine();
            if(output.equals("y")){
                continue;
                
            }
            else{
                break;
            }
            
        }
    }
    
}
