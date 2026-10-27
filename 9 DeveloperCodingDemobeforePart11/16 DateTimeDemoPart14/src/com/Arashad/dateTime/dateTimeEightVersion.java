/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Arashad.dateTime;

/**
 *
 * @author arash
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class dateTimeEightVersion {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        //ye to upar wala apne formate me print ho raha hai but hamchahate hai apne formte me print karna tab
         DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/mm/yy");
         LocalDateTime ldt=LocalDateTime.now();
         String date1=dtf.format(ldt);
         System.out.println(date1);
        
    }
    
}
