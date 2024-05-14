/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import model.ConversorModel;

/**
 *
 * @author mabardaji
 */
public class ConverterPanel extends JPanel implements ActionListener{
    
     //components panell global
     private JTextField tfInputCoin; //informare les monedes que tinc
     private JTextField tfOutCoin; //on es mostra el resultat
     private JButton btConvert; //boto per fer la conversió
     private JRadioButton euroDollar;
     private JRadioButton dollarEuro;
     private final ConversorModel model_jpanel;
     private ActionListener listener;
    
     public ConverterPanel(ConversorModel model_vista) {
        model_jpanel = model_vista;
        listener = this; //JPANEL ConvertePanel
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
        btConvert.setActionCommand("convert");
        btConvert.addActionListener(listener);
        //afegir al panell
        principal.add(tfInputCoin);
        principal.add(btConvert);
        principal.add(tfOutCoin);
        
        euroDollar = new JRadioButton("€ => $");
        euroDollar.setActionCommand("eurodollar"); //no son necessaris pero els mantinc
        euroDollar.addActionListener(listener); //no son necessaris pero els mantinc
        dollarEuro = new JRadioButton("$ => €");
        dollarEuro.setActionCommand("dollareuro"); //no son necessaris pero els mantinc
        dollarEuro.addActionListener(listener); //no son necessaris pero els mantinc
        ButtonGroup grupo_botones = new ButtonGroup(); //associarlos que siguin excluyents
        grupo_botones.add(euroDollar);
        grupo_botones.add(dollarEuro);
        
        
        JPanel radioBotonesPanel = new JPanel(new GridLayout(1, 2));
        radioBotonesPanel.add(euroDollar);
        radioBotonesPanel.add(dollarEuro);
        
        principal.add(radioBotonesPanel);
        
        add(principal, BorderLayout.CENTER);
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() instanceof JButton)
//        {
//            System.out.println("boton");
//        }
//        else if (e.getSource() instanceof JRadioButton)
//        {
//            System.out.println("radio");
//        }
        String action = e.getActionCommand();
        
        switch(action)
        {
            case "convert":
                convertirMoneda();
                break;
        }
  
    }

    private void convertirMoneda() {
        String monedas_texto = tfInputCoin.getText();
        System.out.println(monedas_texto);
        double cambio=0;
        double moneda = Double.parseDouble(monedas_texto);
        System.out.println("-->" + moneda);
        if (euroDollar.isSelected())
        {
            cambio = model_jpanel.EuroToDollar(moneda);
            tfOutCoin.setText(String.valueOf(cambio) + " $");
        }
        else if (dollarEuro.isSelected())
        {
            cambio = model_jpanel.DollarToEuro(moneda);
            tfOutCoin.setText(String.valueOf(cambio) + " €");
        }
        else
        {
            //sout
            //JOPTIONPANE
        }
            
       
    }






}
