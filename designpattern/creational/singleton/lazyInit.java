/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.creational.singleton;

/**
 *
 * @author Asish kumar patri
 */
public class lazyInit {
    private static lazyInit obj;

    public static lazyInit getObj() {
        if(obj==null)
            obj=new lazyInit();
        return obj;
    }
    private lazyInit() {
        System.out.println("Lazy Init object created");
    }
    public void doSomething(){
        //write your code here
        System.out.println("Object Level code of lazyInit");
    }
    
}
