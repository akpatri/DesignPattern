/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.creational.abstractFactory;

/**
 *
 * @author Asish kumar patri
 */
public class vehicleFactory {
    public vehicleFactory_interface createFactory(String name){
        return switch(name){
            case "twoWheeler"->new twoWheelerFactory();
            case "threeWheeler"->new threeWheelerFactory();
            default->null;
        };
    }
    
}
