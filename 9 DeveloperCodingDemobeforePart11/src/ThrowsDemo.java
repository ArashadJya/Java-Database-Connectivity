/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arash
 */
public class ThrowsDemo {
    public static void main(String[] args)  throws Exception{
        
        System.out.println("1");
        Class.forName("com.mysql.jdbc.Driver");
        //if exception occurs and program terminates abnormally then its not a good programming
        
        System.out.println("2");
    }
    
}
