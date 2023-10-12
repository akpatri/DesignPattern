/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.structural.bridge;

/**
 *
 * @author Asish kumar patri
 */
public class youtube extends video {
    public youtube(videoResoultion res) {
        super(res);
        this.setPlatform("YouTube");
        
    }
    
}
