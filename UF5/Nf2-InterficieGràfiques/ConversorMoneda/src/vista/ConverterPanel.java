/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author mabardaji
 */
public class ConverterPanel extends JPanel{
    
     //components panell global
     JTextField tfInputCoin; //informare les monedes que tinc
     JTextField tfOutCoin; //on es mostra el resultat
     JButton btConvert; //boto per fer la conversió
     JRadioButton euroDollar;
     JRadioButton dollarEuro;

    public ConverterPanel() {
        
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        JLabel header = new JLabel("Euro-Dollar Converter");
        header.setHorizontalAlignment(SwingConstants.CENTER);
        add(header,BorderLayout.NORTH);
        
        
        
        JPanel principal = new JPanel();
        principal.setLayout(new GridLayout(2,2));
        tfInputCoin = new JTextField(10);
        tfOutCoin = new JTextField(10);
        tfOutCoin.setEditable(false);
        btConvert = new JButton("Convert");
        
        //afegir al panell
        principal.add(tfInputCoin);
        principal.add(btConvert);
        principal.add(tfOutCoin);
        
        euroDollar = new JRadioButton("€ => $");
        dollarEuro = new JRadioButton("$ => €");
        ButtonGroup grupo_botones = new ButtonGroup(); //associarlos que siguin excluyents
        grupo_botones.add(euroDollar);
        grupo_botones.add(dollarEuro);
        
        
        JPanel radioBotonesPanel = new JPanel(new GridLayout(1, 2));
        radioBotonesPanel.add(euroDollar);
        radioBotonesPanel.add(dollarEuro);
        
        principal.add(radioBotonesPanel);
        
        add(principal, BorderLayout.CENTER);
                
    }






}
