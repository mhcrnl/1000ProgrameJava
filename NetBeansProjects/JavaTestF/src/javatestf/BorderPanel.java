/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestf;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author mhcrnl
 */
class BorderPanel extends JPanel {

    public BorderPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.BLUE);
        
        JButton b1 = new JButton("BUTTON1");
        JButton b2 = new JButton("BUTTON2");
        JButton b3 = new JButton("BUTTON3");
        JButton b4 = new JButton("BUTTON4");
        JButton b5 = new JButton("BUTTON5");
        
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.CENTER);
        add(b3, BorderLayout.WEST);
        add(b4, BorderLayout.EAST);
        add(b5, BorderLayout.SOUTH);
    }
    
}
