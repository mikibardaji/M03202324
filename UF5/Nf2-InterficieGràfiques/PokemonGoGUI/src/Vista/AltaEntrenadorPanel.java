/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import model.Entrenador;
import model.EntrenadorDAO;

/**
 *
 * @author mabardaji
 */
public class AltaEntrenadorPanel extends JPanel implements ActionListener {

    private JTextField tfNomEntrenador;
    private JTextField tfPassword;
    private JButton boto;
    private ActionListener listener;
    private EntrenadorDAO model;
    
    public AltaEntrenadorPanel(EntrenadorDAO modelo) {
        model = modelo;
        listener = this; //escoltes el JPANEL ALta entrenador
        initComponents();
    }
    
    //componentes del panell

    private void initComponents() {
        setLayout(new BorderLayout());
        JLabel header = new JLabel("Alta entrenador");
        header.setHorizontalAlignment(SwingConstants.CENTER);
        add(header,BorderLayout.NORTH);
        
        JPanel principal = new JPanel();
        principal.setLayout(new GridLayout(2,2));
        tfNomEntrenador = new JTextField(20); //longitud BD
        tfPassword = new JTextField(20); //longitud BD
        
        principal.add(new JLabel("nom"));
        principal.add(tfNomEntrenador);
        principal.add(new JLabel("Password"));
        principal.add(tfPassword);
        //principal.add(new JLabel(" "));
        //principal.add(boto);
        
        
        add(principal,BorderLayout.CENTER);
        boto = new JButton("Alta");
        boto.setActionCommand("alta");
        boto.addActionListener(listener);
        add(boto,BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e)  {
        try {
            String action = e.getActionCommand();
            System.out.println(action);
            switch(action)
            {
                case "alta":
                    altaEntrenador();
                    break;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void altaEntrenador() throws SQLException {
        String nombre = tfNomEntrenador.getText();
        String password = tfPassword.getText();
        Entrenador nuevo = new Entrenador(nombre, password);
        
        int alta = model.altaEntrenador(nuevo);
        if (alta > 0)
        {
            JOptionPane.showMessageDialog(this, "Entrenador Alta");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Posible entrenador ya existente o otro error..");
        }
        
    }
    
    
    
    
}
