/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.structural.adapter;

/**
 *
 * @author Asish kumar patri
 */
public class applePhone {
    public void Charge(iphoneCharger charger){
        System.out.print("applePhone is charging :");
        System.out.println(charger.chargeIPhone());
    }
}
