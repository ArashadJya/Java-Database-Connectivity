/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arash
 */
 class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            
        Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("2");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("3");
    }
    
}
