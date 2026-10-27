/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dbapproachdemobeforepart11;

/**
 *
 * @author arash
 */
public class EagerInitDemo {
       
//    1 create private static member
//    2 create private constructer
//    3 create static factory method
   
  private  static  EagerInitDemo eit=new EagerInitDemo();
  
  private EagerInitDemo(){
      System.out.println("Object created");}
  
  public static EagerInitDemo getEgrInitObject(){
      return eit;
  }
    public  void dosomething(){
        System.out.println("I am in singlton class");
    }
}
