/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jdbcdemo1;

/**
 *
 * @author arash
 */
public class JDBCDemo1 {

    public static void main(String[] args) {
        try{
            
        Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception e){
            System.out.println("Hello Message");
           e.printStackTrace();
        }
        
    }
}
