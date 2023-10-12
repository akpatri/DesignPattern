/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.creational.builder;

/**
 *
 * @author Asish kumar patri
 */
public class client {
    public static void main(String args[]){
        Human h1=new Human.HumanBuilder().setAge(20).setName("Arti").build();
        h1.doSomething();
    }
}
