/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rssreader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.w3c.dom.Document;

/**
 *
 * @author mhcrnl
 */
public class NewClass {
    
    public static void main(String[] args) {
        try {
            String st;
            URL url = new URL("http://www.ziare.com/rss/12h.xml");
            URLConnection con = url.openConnection();
            BufferedReader read =new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while((st = read.readLine()) != null){
                sb.append(st);
                
            }
            String raspuns = sb.toString();
            System.out.println(raspuns);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
