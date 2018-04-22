/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestf;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mhcrnl
 */
class IntroPanel extends JPanel {

    public IntroPanel() {
        setBackground(Color.GREEN);
        
        JLabel lb1 = new JLabel("Demonstrarea Layout-ului in Java\n");
        JLabel lb2 = new JLabel("\nAlegeti un tab pt a vedea "+
                "diferite tipuri de layout");
        
        add(lb1); add(lb2);
    }
    
}
