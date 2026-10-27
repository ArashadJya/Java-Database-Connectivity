/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbapproachdemobeforepart11;

/**
 *
 * @author arash
 */
public class StaticDemo {
    static StaticDemo st;
    static {
        st=new StaticDemo();
        System.out.println("object created ");
    }
    public static StaticDemo getValue(){
        return st;
    }
    
}
