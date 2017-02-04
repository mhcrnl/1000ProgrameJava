/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jstutoriale;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mhcrnl
 */
public class JSTutoriale {

    /**
     * @param args the command line arguments
     * 
     */
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    
    public static void main(String[] args) {
        // TODO code application logic here
        JSTutoriale jst = new JSTutoriale();
        jst.showEventDemo();
    }
    
    private void prepareGUI() {
        
        mainFrame = new JFrame("Java Swing Exemplu");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3,1));
        
        headerLabel= new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        
        mainFrame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent windowEvent){
               System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {
       // headerLabel.setText("Control in action: Button");
        JButton okButton = new JButton("Ok");
        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");
        
        okButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");
        submitButton.setActionCommand("Submit");
        
        okButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        
        controlPanel.add(okButton);
        controlPanel.add(cancelButton);
        controlPanel.add(submitButton);
        mainFrame.setVisible(true);
    }
    
    private class ButtonClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(command.equals("Ok")){
                statusLabel.setText("Ok button clicked");
            }
            else if(command.equals("Submit")) {
                statusLabel.setText("Submit button clicked");
            }
            else {
                statusLabel.setText("Cancel button clicked");
            }
        }
        
    }
}
