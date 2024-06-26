/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import model.ConversorModel;

/**
 *
 * @author mabardaji
 */
public class MainFrame extends JFrame implements ActionListener{

    private ActionListener listener;
    
    private final ConversorModel model_vista;
    /*
    afegir els components i fer-la visible
    */
    public MainFrame(ConversorModel model)  {
        model_vista = model;
        initComponents();
    }

    private void initComponents() {

        //asigno quin component sera el encarregat d'escolar events
        listener = this; //el listener escoltar els events del this (MainFrame extens JFrame)
        
        
       //anular la X de la finestra 
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                doExit();
            }
            
            
            
        });
        //afegir barra men�
        buildMenuBar();
        Container pane  = getContentPane();
        WelcomePanel panel_bienvenida = new WelcomePanel();
        //ConverterPanel conversor = new ConverterPanel();
        pane.add(panel_bienvenida);
        //pane.add(conversor);
       this.setTitle("Conversor � To $");
       this.setSize(450, 300);
       setLocationRelativeTo(null);
       setVisible(true);
    }

   

    /*crearem una barra de menu
    amb 3 men�s i itens
    */
    private void buildMenuBar() {
        JMenuBar menuBarra  = new JMenuBar();
        JMenu menu;
        JMenuItem item;
        
        menu = new JMenu("File");
        item = new JMenuItem("Init");
        item.setActionCommand("init");
        item.addActionListener(listener);
        menu.add(item);
        
        item = new JMenuItem("Exit");
        item.setActionCommand("exit");
        item.addActionListener(listener);
        menu.add(item);
        
        menuBarra.add(menu);
        
        
        menu = new JMenu("Convert");
        item = new JMenuItem("Convert");
        item.setActionCommand("convert");
        item.addActionListener(listener);
        menu.add(item);
        menuBarra.add(menu);
        
        menu = new JMenu("Help");
        item = new JMenuItem("About");
        item.setActionCommand("about");
        item.addActionListener(listener);
        menu.add(item);
        menuBarra.add(menu);
        //JFRAME
        
        this.setJMenuBar(menuBarra);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            String action = e.getActionCommand(); //capturo el action command per saber
            //qui ha fet el event
            switch (action){
                case "init":
                    showWelcomePanel();
                    break;                
                case "exit":
                    doExit();
                    break;
                case "convert":
                    showConverterPanel();
                    break;                    
                case "about":
                    showAboutDialog();
                    break;                   
            }
       
    }

    private void showAboutDialog() {
        JOptionPane.showMessageDialog(this, "Conversor creat per bardaji", "About", JOptionPane.INFORMATION_MESSAGE);
    }

    private void doExit() {
        int answer = JOptionPane.showConfirmDialog(this, "Sure to Exit");
        if (answer == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
            
    }

    /**
     * carregar el panel conversor al JFRAMe principal
     */
    private void showConverterPanel() {
         ConverterPanel conversor = new ConverterPanel(model_vista);   
         this.setContentPane(conversor);
         this.validate();

    }

    private void showWelcomePanel() {
        //Bienvenida2 bienvenida = new Bienvenida2();
        WelcomePanel bienvenida = new WelcomePanel();   
          this.setContentPane(bienvenida);
         this.validate();
    }
    
    
    
    
    
}
