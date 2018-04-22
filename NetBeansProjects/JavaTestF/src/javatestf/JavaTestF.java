/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestf;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 *
 * @author mhcrnl
 */
public class JavaTestF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTabbedPane tb = new JTabbedPane();
        tb.addTab("Intro", new IntroPanel());
        tb.add("Flow", new FlowPanel());
        tb.add("Border", new BorderPanel());
        tb.add("Grid", new GridPanel());
        tb.add("Box", new BoxPanel());
        
        frame.getContentPane().add(tb);
        frame.pack();
        frame.setVisible(true);
    }
    
}
