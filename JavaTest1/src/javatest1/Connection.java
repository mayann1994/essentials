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

/**
 *
 * @author louie
 */
public class Connection {
    URL resource;
    BufferedReader in;
    
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
    
    
}
