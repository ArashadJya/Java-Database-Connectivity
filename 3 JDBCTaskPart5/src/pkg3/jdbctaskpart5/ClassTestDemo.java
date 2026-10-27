/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3.jdbctaskpart5;

/**
 *
 * @author arash
 */
public class ClassTestDemo {
    int roll_no=101;
    String name="Arasdhad";
    void display(){
        System.out.println(roll_no+" :"+name);
    }
    void message(){
        System.out.println("Hello message");
    }
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("pkg3.jdbctaskpart5.ClassTestDemo");
        System.out.println("class :"+c.getName());
        System.out.println("Package :"+c.getPackage());
        System.out.println("Fields :"+c.getDeclaredFields());
        System.out.println(c.getMethods());
    }
    
}
