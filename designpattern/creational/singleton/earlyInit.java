/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.creational.singleton;

/**
 *
 * @author Asish kumar patri
 */
public class earlyInit {
    private static earlyInit obj=new earlyInit();

    public static earlyInit getObj() {
        return obj;
    }
    private earlyInit(){
        System.out.println("earlyInit Object created");
    }
    public void doSomething(){
        //write your code here
        System.out.println("Object level code of earlyInit");
    }
}
