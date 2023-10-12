/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.structural.bridge;

/**
 *
 * @author Asish kumar patri
 */

/*
here video and its extended class name is abstraction 
and their body is implementation 
for different VideoResolution their body is different so each resoulation creates different body
hence abstration and implementation makes one to many relationship
*/
public class client {
    public static void main(String[] args) {
        video vid=new youtube(new sd());
        vid.play();
    }
}
