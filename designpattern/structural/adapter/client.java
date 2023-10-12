/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.structural.adapter;

/**
 *
 * @author Asish kumar patri
 */
public class client {
    public static void main(String[] args) {
        applePhone phone1=new applePhone();
        phone1.Charge(new appleCharger());
        
        /*but the case is we have no apple charger
        * hence we have to built a new charger that adapt android phone charger and charge our apple phone
        */
        applePhone phone2=new applePhone();
        phone2.Charge(new iphoneAdapterCharger( new redmiCharger()));
        
    }
}
