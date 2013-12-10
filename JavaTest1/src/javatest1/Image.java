/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javatest1;

/**
 *
 * @author louie
 */
public class Image {
    //private int progress;
    private String src;
    
    /**
     * Handles the image inside the html code
     * @param src the source path of the image
     */
    public Image(String src) {
        this.src = src;
        //this.progress = 0;
    }
    
    public String getSrc() {
        return src;
    
    }
    
    public void setSrc(String src) {
        this.src = src;
    }
}
