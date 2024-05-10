/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mabardaji
 */
public class WelcomePanel extends JPanel{

    public WelcomePanel() {
        
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        JLabel lbWelcome = new JLabel();
        lbWelcome.setText("Welcome to My Converter");
        add(lbWelcome, BorderLayout.CENTER);
    }
    
    
}
