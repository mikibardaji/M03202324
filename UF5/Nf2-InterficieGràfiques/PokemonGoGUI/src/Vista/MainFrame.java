/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import model.EntrenadorDAO;

/**
 *
 * @author mabardaji
 */
public class MainFrame extends JFrame implements ActionListener{
    
    private ActionListener listener;
    private final EntrenadorDAO model;

    public MainFrame(EntrenadorDAO model) {
        this.model = model;
        listener = this;
        initComponents();
    }

    private void initComponents() {
               //anular la X de la finestra 
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                doExit();
            }
            
            
        });
        
        buildMenuBar();
        Container pane  = getContentPane();
        pane.add(new JLabel("Pokemon GO 2024 DAW"));
       // AltaEntrenadorPanel alta = new AltaEntrenadorPanel();
       // pane.add(alta);
        this.setTitle("PokemonGO");
        this.setSize(450, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void doExit() {
        int answer = JOptionPane.showConfirmDialog(this, "Sure to Exit");
        if (answer == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
            
    }

    private void buildMenuBar() {
        JMenuBar menuBarra = new JMenuBar();
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
        
        menu = new JMenu("Manage");
        item = new JMenuItem("Add Entrenador... ");
        item.setActionCommand("add");
        item.addActionListener(listener);
        menu.add(item);
        item = new JMenuItem("Remove Entrenador");
        item.setActionCommand("del");
        item.addActionListener(listener);
        menu.add(item);
        
        menuBarra.add(menu);
        
        menu = new JMenu("Help");
        item = new JMenuItem("About");
        item.setActionCommand("about");
        item.addActionListener(listener);
        menu.add(item);
        menuBarra.add(menu);
        //JFRAME inicialitzo la jmenubar
        this.setJMenuBar(menuBarra);
        
        
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch(action)
        {
            case "add":
            addPanel();
            break;
        }
    }

    private void addPanel() {
        AltaEntrenadorPanel alta = new AltaEntrenadorPanel(model);
        this.setContentPane(alta);
        this.validate();
    }
    
    
}
