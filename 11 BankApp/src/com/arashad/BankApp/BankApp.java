
package com.arashad.BankApp;
import java.util.Scanner;
import java.sql.*;
public class BankApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("select any option");
        System.out.println("1:Add Account");
        System.out.println("2:Fund Transfer");
        System.out.println("3:Mini Statement");
        System.out.println("4 Exit");
        
        int userOption=sc.nextInt();
        sc.nextLine();
       
        if(userOption==1){
            System.out.println("Enter id");
            int id=sc.nextInt();
            
            System.out.println("Enter Name");
            String name=sc.next();
            
            System.out.println("Enter Email");
            String email=sc.next();
            
            System.out.println("Enter phone no");
            String phno=sc.next();
            
            System.out.println("Enter AccountNo");
            int accountno=sc.nextInt();
            sc.nextLine();
            
            Connection con=null;
            
            try{
                 con= DbConnection.getConnect();
                con.setAutoCommit(false);
                PreparedStatement ps=con.prepareStatement("insert into users values(?,?,?,?,?)");
                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setString(3, email);
                ps.setString(4, phno);
                ps.setInt(5, accountno);
                sc.nextLine();
                int rowcount=ps.executeUpdate();
                if(rowcount>0){
                    con.commit();
                    System.out.println("Account created sucessfully");
                }
               
            }
            catch(Exception e){
                System.out.println("Account can not be created " );
               try{
                    con.rollback();
               }
               catch(SQLException es){
                   System.out.println(es);
               }
                
            }
            try{
                 con=DbConnection.getConnect();
                 
                 PreparedStatement ps=con.prepareStatement("insert into total_ammount values(?,?,?)");
                 System.out.println("Please enter a balance");
                 int balance=sc.nextInt();
                 ps.setInt(1, id);
                 ps.setInt(2, accountno);
                 ps.setInt(3, balance);
                 
                 int rowcount1=ps.executeUpdate();
                 if(rowcount1>0){
                     System.out.println("Balance add sucessfully");
                 }
                 else{
                     System.out.println("failed");
                 }
            }
            catch(Exception e){
                System.out.println(e);
            }
            
          
    }
        else if(userOption==2){
    System.out.println("Fund Transfer");
    }
        else if(userOption==3){
    System.out.println("Mini Statement");
    }
    else{
            break;
    }
            System.out.println("do you want to continue enter y/n");
            String input=sc.nextLine();
            if(input.equals("y")){
                continue;
            }
            else{
                break;
            }
            
                
        }
       
  
    }   
}
