/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Arashad.dateTime;

/**
 *
 * @author arash
 */
import java.sql.Date;
import java.sql.Time;
public class sqlDateTime {
    public static void main(String[] args) {
        //first way
        java.util.Date d=new java.util.Date();
        Date dd=new Date(d.getTime());
        System.out.println(dd);
        
        //second way
        
        long millis=System.currentTimeMillis();
        Date dt=new Date(millis);
        System.out.println(dt);
        
    }
    
}
