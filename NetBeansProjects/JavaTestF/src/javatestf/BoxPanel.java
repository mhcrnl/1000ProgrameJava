/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestf;

import java.awt.*;
import javafx.scene.paint.Color;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author mhcrnl
 */
class BoxPanel extends JPanel {

    public BoxPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        //setBackgroud(Color.blue);
        
        JButton b1 = new JButton("Button1");
        JButton b2 = new JButton("Button2");
        JButton b3 = new JButton("Button3");
        JButton b4 = new JButton("Button4");
        JButton b5 = new JButton("Button5");
        
        add(b1);
        add(Box.createRigidArea(new Dimension(0,10)));
        add(b2);
        add(Box.createVerticalGlue());
        add(b3);
        add(b4);
        add(Box.createRigidArea(new Dimension(0,20)));
        add(b5);
    }
    
}
