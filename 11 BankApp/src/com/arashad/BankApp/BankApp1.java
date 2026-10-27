/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arash
 */
package com.arashad.BankApp;
import java.util.Scanner;
import java.sql.*;
import java.text.SimpleDateFormat;

public class BankApp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Select any option");
            System.out.println("1: Add Account");
            System.out.println("2: Fund Transfer");
            System.out.println("3: Mini Statement");
            System.out.println("4: Exit");

            int userOption = sc.nextInt();

            if (userOption == 1) {
                System.out.println("Enter id");
                int id = sc.nextInt();

                System.out.println("Enter Name");
                String name = sc.next();

                System.out.println("Enter Email");
                String email = sc.next();

                System.out.println("Enter phone no");
                String phno = sc.next();

                System.out.println("Enter AccountNo");
                int accountno = sc.nextInt();

                System.out.println("Please enter a balance");
                int balance = sc.nextInt();
                sc.nextLine();

                Connection con = null;
                try {
                    con = DbConnection.getConnect();
                    con.setAutoCommit(false); // start transaction

                    // Insert into users
                    PreparedStatement ps1 = con.prepareStatement("insert into users values(?,?,?,?,?)");
                    ps1.setInt(1, id);
                    ps1.setString(2, name);
                    ps1.setString(3, email);
                    ps1.setString(4, phno);
                    ps1.setInt(5, accountno);

                    int rowcount1 = ps1.executeUpdate();

                    // Insert into total_amount
                    PreparedStatement ps2 = con.prepareStatement("insert into total_ammount values(?,?,?)");
                    ps2.setInt(1, id);
                    ps2.setInt(2, accountno);
                    ps2.setInt(3, balance);

                    int rowcount2 = ps2.executeUpdate();

                    if (rowcount1 > 0 && rowcount2 > 0) {
                        con.commit();
                        System.out.println("Account created successfully with balance.");
                    } else {
                        con.rollback();
                        System.out.println("Account creation failed.");
                    }

                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    try {
                        if (con != null) con.rollback();
                    } catch (SQLException es) {
                        System.out.println("Rollback failed: " + es);
                    }
                } 
//                finally {
//                    try {
//                        if (con != null) con.close();
//                    } catch (SQLException e) {
//                        System.out.println("Error closing connection: " + e);
//                    }
//                }

            }
                else if (userOption == 2) {
                System.out.println("enter from account no");
                int fromAccount=sc.nextInt();
                
                System.out.println("enter to account no");
                int toaccount=sc.nextInt();
                
                System.out.println("enter deposite ammount");
                int deposite_ammount=sc.nextInt();
                sc.nextLine();
                
                int from_bal=0, to_bal=0;
                Connection con=null;
                try{
                     con=DbConnection.getConnect();
                con.setAutoCommit(false);
                    
                    PreparedStatement ps7=con.prepareStatement("select balance from total_ammount where accountno=?");
                    ps7.setInt(1, fromAccount);
                    ResultSet rs1=ps7.executeQuery();
                    if(rs1.next()){
                        from_bal=rs1.getInt(1);
                        
                   PreparedStatement ps8=con.prepareStatement("select balance from total_ammount where accountno=?");
                   ps8.setInt(1, toaccount);
                   ResultSet rs2=ps8.executeQuery();
                   if(rs2.next()){
                       to_bal=rs2.getInt(1);
                       
                       int new_from_bal=from_bal-deposite_ammount;
                       int new_to_ammount=to_bal+deposite_ammount;
                       
                       PreparedStatement ps3=con.prepareStatement("update total_ammount set balance=? where accountno=? ");
                       ps3.setInt(1, new_from_bal);
                       ps3.setInt(2, fromAccount);
                       int rowcount3=ps3.executeUpdate();
                       
                       PreparedStatement ps4=con.prepareStatement("update total_ammount set balance=? where accountno=? ");
                       ps4.setInt(1, new_to_ammount);
                       ps4.setInt(2, toaccount);
                       int rowcount4=ps4.executeUpdate();
                       
                       //get System current date and time
                       long millis=System.currentTimeMillis();
                       Date date=new Date(millis);
                       Time time=new Time(millis);
                        
                        PreparedStatement ps5=con.prepareStatement("insert into mini_statement values(?,?,?,?,?)");
                        ps5.setInt(1, fromAccount);
                        ps5.setInt(2, deposite_ammount);
                        ps5.setString(3, "d");
                        ps5.setDate(4, date);
                        ps5.setTime(5, time);
                        int rowcount5=ps5.executeUpdate();
                        
                        PreparedStatement ps6=con.prepareStatement("insert into mini_statement values(?,?,?,?,?)");
                        ps6.setInt(1, toaccount);
                        ps6.setInt(2, deposite_ammount);
                        ps6.setString(3, "c");
                        ps6.setDate(4, date);
                        ps6.setTime(5, time);
                        int rowcount6=ps6.executeUpdate();
                        if(rowcount3>0 && rowcount4>0 && rowcount5>0&& rowcount6>0){
                            con.commit();
                            System.out.println("value update sucessfully");
                        }
                        else{
                            System.out.println("error");
                            con.rollback();
                        }
                   }
                    }
                }
                
                catch(SQLException es){
                    try{
                        System.out.println("catch block");
                        con.rollback();
                    }
                    catch(SQLException se){
                        System.out.println(se);
                    }
                }
                
            } else if (userOption == 3) {
                System.out.println("Mini Statement");
            } else {
                break;
            }

            System.out.println("Do you want to continue? enter y/n");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }
    }
}

