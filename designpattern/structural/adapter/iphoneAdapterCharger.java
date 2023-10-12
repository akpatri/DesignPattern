/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.structural.adapter;

/**
 *
 * @author Asish kumar patri
 */
public class iphoneAdapterCharger implements iphoneCharger {
    /*
    * this class create a iphoeCharger
    * but have the object of android charger to charge via android charger 
    */
    androidCharger charger;
    public iphoneAdapterCharger(androidCharger charger){
        this.charger=charger;
    }
    @Override
    public String chargeIPhone() {
        return charger.chargeAndroid();
    }
    
}
