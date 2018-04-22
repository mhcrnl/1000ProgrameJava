/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Borders;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mhcrnl
 */
public class BordersTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Testarea Bordurilor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0,2,5,10));
        panel.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        
        JPanel p1 = new JPanel();
        p1.setBorder(BorderFactory.createLineBorder(Color.yellow, 3));
        p1.add(new JLabel("LINE BORDER"));
        panel.add(p1);
        
        JPanel p2 = new JPanel();
        p2.setBorder(BorderFactory.createEtchedBorder());
        p2.add(new JLabel("ETCHED BORDER"));
        panel.add(p2);
        
        JPanel p3 = new JPanel();
        p3.setBorder(BorderFactory.createRaisedBevelBorder());
        p3.add(new JLabel("Raised Bevel Border"));
        panel.add(p3);
        
        JPanel p4 = new JPanel();
        p4.setBorder(BorderFactory.createLoweredBevelBorder());
        p4.add(new JLabel("Lowered Bevel Border"));
        panel.add(p4);
        
        JPanel p5 = new JPanel();
        p5.setBorder(BorderFactory.createTitledBorder("Title"));
        p5.add(new JLabel("Titled border"));
        panel.add(p5);
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
