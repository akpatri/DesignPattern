/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.structural.adapter;

/**
 *
 * @author Asish kumar patri
 */
public class redmiCharger implements androidCharger{

    @Override
    public String chargeAndroid() {
        return "charge via redmi android Charger";
    }
    
}
