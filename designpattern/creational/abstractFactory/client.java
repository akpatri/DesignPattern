/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.creational.abstractFactory;

/**
 *
 * @author Asish kumar patri
 */
public class client {
    public static void main(String[] args){
        vehicleFactory vf=new vehicleFactory();
        vehicleFactory_interface vfi=vf.createFactory("twoWheeler");
        twoWheeler_interface twi=vfi.getTwoWheeler("bike");
        System.out.println(twi.type());
        
        vfi=vf.createFactory("threeWheeler");
        threeWheeler_interface t_w=vfi.getThreeWheeler("rikshaw");
        System.out.println(t_w.type());
    }
}
