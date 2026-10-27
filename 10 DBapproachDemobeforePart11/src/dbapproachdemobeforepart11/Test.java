/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbapproachdemobeforepart11;

/**
 *
 * @author arash
 */
public class Test {
    public static void main(String[] args) {
        //By using static block initialization
//        StaticDemo.getValue();
//        StaticDemo.getValue();
//        StaticDemo.getValue();
//        StaticDemo.getValue();
//        ham isme jitna chahe utna object create karle ye ek hi bar call hoga kyuki ye singlton class ka object hai
//          singlton class means that have only one object


         //By using Eager Initialization
          EagerInitDemo eg= EagerInitDemo.getEgrInitObject() ;
          EagerInitDemo eg1=EagerInitDemo.getEgrInitObject();
            //isme new keyword nahi laga hai kyuki constructer private hai fhyan rahr ye object nahi hai kyuki isme new nahi hai
          eg.dosomething();
                  
    }
    
}
