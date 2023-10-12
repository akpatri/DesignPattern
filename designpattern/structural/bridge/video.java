/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.structural.bridge;

/**
 *
 * @author Asish kumar patri
 */
public abstract class video {
    private videoResoultion res;
    private String platform;

    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    public video(videoResoultion res){
        this.res=res;
    }
    public void play(){
        System.out.println(this.getPlatform()+" :"+res.getResoultaion());
    }
}
