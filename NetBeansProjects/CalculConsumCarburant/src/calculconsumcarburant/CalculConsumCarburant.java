/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculconsumcarburant;

import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author mhcrnl
 */
public class CalculConsumCarburant {

    /**
     * @param args the command line arguments
     */
    JFrame f;
    CalculConsumCarburant(){
        f = new JFrame("Exemplu JComboBox");
        String[] tari ={"Romania", "Bulgaria", "ungaria"};
        JComboBox cb = new JComboBox(tari);
        cb.setBounds(50,50,90,20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new CalculConsumCarburant();
    }
    
}
