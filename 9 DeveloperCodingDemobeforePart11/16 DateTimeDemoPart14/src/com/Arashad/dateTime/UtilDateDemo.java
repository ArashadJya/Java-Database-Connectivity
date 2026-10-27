/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Arashad.dateTime;

/**
 *
 * @author arash
 */
import java.text.SimpleDateFormat;
import java.util.Date;
public class UtilDateDemo {
    public static void main(String[] args) {
        Date d=new Date();
        
//        System.out.println( d.getDate());
//        System.out.println(d.getTime()); 
         //-------------if we want to get date and time in string-----------//
          SimpleDateFormat sd=new SimpleDateFormat("dd/MM/YYYY");
          String date1=sd.format(d);
          System.out.println(date1);
          
          //----------second way----------//
          long l=System.currentTimeMillis();
          Date dd=new Date(l);
          System.out.println(dd);
    }
    
}
