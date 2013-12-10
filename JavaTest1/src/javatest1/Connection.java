/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javatest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author louie
 */
public class Connection {
    URL resource;
    static BufferedReader in;
    ArrayList<Image> images;
    
    /**
     * 
     * @param resource URL for the website you want to visit
     * @throws IOException 
     */
    public Connection(URL resource) throws IOException {
        this.resource = resource;
        URLConnection spoof = resource.openConnection();
        in = new BufferedReader(new InputStreamReader(spoof.getInputStream()));
    }
    
    public ArrayList<Image> getImages() {
        return this.images;
    }
    
    public static void main(String[] args) {
        String line;
        try {
            new Connection(new URL("https://google.com"));
            while((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
