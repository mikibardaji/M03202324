/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
/**
 *
 * @author mabardaji
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUIGridLayout();
            }

        });
    }

private static void createAndShowGUIGridLayout()
    { //una finestra
      //i li donarem la disposició del panell
      JFrame window = new JFrame("BorderLayoutExample");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
      Container pane = window.getContentPane();
      //disposició dels components dintre aquest panel contenidor
      
      pane.setLayout(new GridLayout(4, 2));
      
      //5 etiquetes que les afegirem
      JLabel norte, sur, este, oeste, centro;
      norte = new JLabel("Etiqueta 1");
      //per ficar el text centrat dins la etiqueta
      norte.setHorizontalAlignment(SwingConstants.CENTER);
      norte.setBackground(Color.red);

      sur = new JLabel("Etiqueta 2");
      //per ficar el text centrat dins la etiqueta
      sur.setHorizontalAlignment(SwingConstants.CENTER);
      sur.setBackground(Color.BLUE);
      sur.setForeground(Color.YELLOW);
      sur.setOpaque(true);
        
      este = new JLabel("Etiqueta 3");
      este.setHorizontalAlignment(SwingConstants.RIGHT);
      este.setBackground(Color.ORANGE);
      este.setForeground(Color.yellow);
      este.setOpaque(true);
      
      oeste = new JLabel("Etiqueta 4");
      oeste.setHorizontalAlignment(SwingConstants.CENTER);
      oeste.setBackground(Color.MAGENTA);

//      centro = new JLabel("Etiqueta 5");
//      centro.setHorizontalAlignment(SwingConstants.CENTER);
//      centro.setBackground(Color.PINK);     

       JButton boton = new JButton("aprieta");
       boton.setForeground(Color.red);

       JButton boton2 = new JButton("aprieta2");
       boton2.setForeground(Color.blue);       
       JButton boton3 = new JButton("aprieta3");
       boton3.setForeground(Color.blue);        
       pane.add(norte);
       pane.add(sur);
       pane.add(este);
       pane.add(oeste);
       pane.add(boton);
       pane.add(boton2);
       pane.add(boton3);
      
      window.setSize(500, 200);
      window.setLocationRelativeTo(null);
      window.setVisible(true);
      
    }

    
    
    
    private static void createAndShowGUIFlowLayout()
    { //una finestra
      //i li donarem la disposició del panell
      JFrame window = new JFrame("BorderLayoutExample");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
      Container pane = window.getContentPane();
      //disposició dels components dintre aquest panel contenidor
      //pane.setLayout(new FlowLayout());
      pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
      
      //5 etiquetes que les afegirem
      JLabel norte, sur, este, oeste, centro;
      norte = new JLabel("Etiqueta 1");
      //per ficar el text centrat dins la etiqueta
      norte.setHorizontalAlignment(SwingConstants.CENTER);
      norte.setBackground(Color.red);

      sur = new JLabel("Etiqueta 2");
      //per ficar el text centrat dins la etiqueta
      sur.setHorizontalAlignment(SwingConstants.CENTER);
      sur.setBackground(Color.BLUE);
      sur.setForeground(Color.YELLOW);
      sur.setOpaque(true);
        
      este = new JLabel("Etiqueta 3");
      este.setHorizontalAlignment(SwingConstants.RIGHT);
      este.setBackground(Color.ORANGE);
      este.setForeground(Color.yellow);
      este.setOpaque(true);
      
      oeste = new JLabel("Etiqueta 4");
      oeste.setHorizontalAlignment(SwingConstants.CENTER);
      oeste.setBackground(Color.MAGENTA);

//      centro = new JLabel("Etiqueta 5");
//      centro.setHorizontalAlignment(SwingConstants.CENTER);
//      centro.setBackground(Color.PINK);     

       JButton boton = new JButton("aprieta");
       boton.setForeground(Color.red);

       JButton boton2 = new JButton("aprieta2");
       boton2.setForeground(Color.blue);       
       JButton boton3 = new JButton("aprieta3");
       boton3.setForeground(Color.blue);        
       pane.add(norte);
       pane.add(sur);
       pane.add(este);
       pane.add(oeste);
       pane.add(boton);
       pane.add(boton2);
       pane.add(boton3);
      
      window.setSize(500, 200);
      window.setLocationRelativeTo(null);
      window.setVisible(true);
      
    }



    
    
    
    
    private static void createAndShowGUIBorderLayout()
    { //una finestra
      //i li donarem la disposició del panell
      JFrame window = new JFrame("BorderLayoutExample");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
      Container pane = window.getContentPane();
      //disposició dels components dintre aquest panel contenidor
      pane.setLayout(new BorderLayout());
      //pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
      
      //5 etiquetes que les afegirem
      JLabel norte, sur, este, oeste, centro;
      norte = new JLabel("Etiqueta 1");
      //per ficar el text centrat dins la etiqueta
      norte.setHorizontalAlignment(SwingConstants.CENTER);
      norte.setBackground(Color.red);

      sur = new JLabel("Etiqueta 2");
      //per ficar el text centrat dins la etiqueta
      sur.setHorizontalAlignment(SwingConstants.CENTER);
      sur.setBackground(Color.BLUE);
      sur.setForeground(Color.YELLOW);
      sur.setOpaque(true);
        
      este = new JLabel("Etiqueta 3");
      este.setHorizontalAlignment(SwingConstants.RIGHT);
      este.setBackground(Color.ORANGE);
      este.setForeground(Color.yellow);
      este.setOpaque(true);
      
      oeste = new JLabel("Etiqueta 4");
      oeste.setHorizontalAlignment(SwingConstants.CENTER);
      oeste.setBackground(Color.MAGENTA);

//      centro = new JLabel("Etiqueta 5");
//      centro.setHorizontalAlignment(SwingConstants.CENTER);
//      centro.setBackground(Color.PINK);     

       JButton boton = new JButton("aprieta");
       boton.setForeground(Color.red);

 
      pane.add(norte, BorderLayout.NORTH);
      pane.add(sur,BorderLayout.CENTER);
      pane.add(este,BorderLayout.EAST);
      pane.add(oeste, BorderLayout.WEST);
      pane.add(boton,BorderLayout.SOUTH);

//      pane.add(norte);
//      pane.add(sur);
//      pane.add(este);
//      pane.add(oeste);
//      pane.add(boton);
      
      window.setSize(500, 200);
      window.setLocationRelativeTo(null);
      window.setVisible(true);
      
    }
    
    private static void createAndShowGUI2()
    { //una finestra
      //i li donarem la disposició del panell
      JFrame window = new JFrame("BorderLayoutExample");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
      Container pane = window.getContentPane();
      //disposició dels components dintre aquest panel contenidor
      pane.setLayout(new BorderLayout());
      //pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
      JPanel panel_este = new JPanel(new BorderLayout());
      JPanel panel_oeste=null;
      panel_oeste = new JPanel(new BoxLayout(panel_oeste,BoxLayout.Y_AXIS));
      //5 etiquetes que les afegirem
      JLabel norte, sur, este, oeste, centro;
      norte = new JLabel("Etiqueta 1");
      //per ficar el text centrat dins la etiqueta
      norte.setHorizontalAlignment(SwingConstants.CENTER);
      norte.setBackground(Color.red);

      sur = new JLabel("Etiqueta 2");
      //per ficar el text centrat dins la etiqueta
      sur.setHorizontalAlignment(SwingConstants.CENTER);
      sur.setBackground(Color.BLUE);
      sur.setForeground(Color.YELLOW);
      sur.setOpaque(true);
        
      este = new JLabel("Etiqueta 3");
      este.setHorizontalAlignment(SwingConstants.RIGHT);
      este.setBackground(Color.ORANGE);
      este.setForeground(Color.yellow);
      este.setOpaque(true);
      
      oeste = new JLabel("Etiqueta 4");
      oeste.setHorizontalAlignment(SwingConstants.CENTER);
      oeste.setBackground(Color.MAGENTA);

      centro = new JLabel("Etiqueta 5");
      centro.setHorizontalAlignment(SwingConstants.CENTER);
      centro.setBackground(Color.PINK);     


 
      panel_este.add(norte, BorderLayout.NORTH);
      panel_este.add(sur,BorderLayout.CENTER);
      panel_este.add(este,BorderLayout.EAST);
      panel_este.add(oeste, BorderLayout.WEST);
      panel_este.add(centro,BorderLayout.SOUTH);
      
      
      panel_oeste.add(new JButton("aprieta"));
      panel_oeste.add(new JButton("o"));
      panel_oeste.add(new JButton("aprieta aqui"));

      
      pane.add(panel_este, BorderLayout.EAST);
      pane.add(panel_oeste, BorderLayout.WEST);
//      pane.add(norte);
//      pane.add(sur);
//      pane.add(este);
//      pane.add(oeste);
//      pane.add(boton);
      
      window.setSize(500, 200);
      window.setLocationRelativeTo(null);
      window.setVisible(true);
      
    }    
    

    
    
    
    
    
    private static void helloWorld() 
    {
        JFrame window = new JFrame("HelloWordSwing");
        //definim acció de quant apretes amb X
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel etiqueta_label = new JLabel("Hello World"); //component
        //associar o afegir el component al contenidor principal
        window.getContentPane().add(etiqueta_label);
    
        JLabel etiqueta2 = new JLabel("Bye");
        window.getContentPane().add(etiqueta2);
        JButton boton1 = new JButton("Aprieta");
        window.getContentPane().add(boton1);
        //la farem visible
        window.setSize(400, 250);
        window.setLocationRelativeTo(null);
        window.pack();
        window.setVisible(true);
    
    }

    
}
