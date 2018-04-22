/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestf;

import java.awt.GridLayout;
import javafx.scene.paint.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author mhcrnl
 */
class GridPanel extends JPanel {

    public GridPanel() {
        setLayout(new GridLayout(2,3));
        //setBackground(Color.green);
        
        JButton b1 = new JButton("BUTTON1");
        JButton b2 = new JButton("BUTTON1");
        JButton b3 = new JButton("BUTTON1");
        JButton b4 = new JButton("BUTTON1");
        JButton b5 = new JButton("BUTTON1");
        
        add(b1); add(b2); add(b3); add(b4); add(b5);   

    }
    
}
