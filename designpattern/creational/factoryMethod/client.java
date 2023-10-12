/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designpattern.creational.factoryMethod;

/**
 *
 * @author Asish kumar patri
 */
public class client{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VehicleFactory f=new VehicleFactory();
        vehicle v=f.produceObject(2);
        System.out.println(v.type());
        
        
    }
    
}
