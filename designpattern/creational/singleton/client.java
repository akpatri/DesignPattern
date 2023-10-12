/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.creational.singleton;

/**
 *
 * @author Asish kumar patri
 */
public class client {
    public static void main(String[] args) throws ClassNotFoundException {
        earlyInit eI=earlyInit.getObj();
        eI.doSomething();
        
        lazyInit lI=lazyInit.getObj();
        lI.doSomething();
    }
}
