/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.creational.builder;

/**
 *
 * @author Asish kumar patri
 */
public class Human {
    private final String name;
    private final int age;
    private Human(HumanBuilder human){
        this.age=human.age;
        this.name=human.name;
        System.out.println("Human object Created :"+"name="+name+" age= "+age);
    }
    public void doSomething(){
        //write your code here
        System.out.println("Object level code");
    }
    
    public static class HumanBuilder{
        private String name;
        private int age;

        public HumanBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public HumanBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        
        public Human build(){
            return new Human(this);
        }
        
    }


}