/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.creational.abstractFactory;

/**
 *
 * @author Asish kumar patri
 */
public class threeWheelerFactory implements vehicleFactory_interface{

    @Override
    public twoWheeler_interface getTwoWheeler(String name) {
        return null;
    }

    @Override
    public threeWheeler_interface getThreeWheeler(String name) {
        return switch(name){
            case "car" -> new car();
            case "rikshaw" -> new rikshaw();
            default -> null;
        };
    }
    
}
