package designpattern.creational.factoryMethod;

import java.util.Scanner;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asish kumar patri
 */
public class VehicleFactory {
    public vehicle produceObject(int wheel){
        return switch (wheel) {
            case 2 -> new twoWheeler();
            case 3 -> new threeWheeler();
            default -> null;
        };
    }

   
    
}
