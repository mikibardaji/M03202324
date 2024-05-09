package cat.proven.currencyconverter;

import cat.proven.currencyconverter.model.CurrencyConverter;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainFrame extends JFrame implements ActionListener {
  
    private ActionListener listener;
    private String aboutMessage;
    private final CurrencyConverter model;
    
    public MainFrame(CurrencyConverter model) {
        this.model = model;
        aboutMessage = "<html><p>Currency converter 1.0</p><p>(c)ProvenSoft 2021</p></html>";        
        initComponents();
    }

    private void initComponents() {
        listener = this;
        setTitle("Currency converter");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exitApp();
            }
        });
        
        Container pane = getContentPane();
        buildMenuBar();
        JPanel welcomePanel = new WelcomePanel();
        pane.add(welcomePanel);
        setSize(450, 300);
        setLocationRelativeTo(null);
    }

    private void exitApp() {
        int answer = JOptionPane.showConfirmDialog(this, "Sure to exit?");
        if (answer == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void buildMenuBar() {
        JMenuBar mnuBar = new JMenuBar();
        JMenu mnu;
        JMenuItem item;
        //file menu
        mnu = new JMenu("File");
            item = new JMenuItem("Exit");
            item.setActionCommand("exit");
            item.addActionListener(listener);
            mnu.add(item);
        mnuBar.add(mnu);
        //edit menu
        mnu = new JMenu("Edit");
            item = new JMenuItem("Convert");
            item.setActionCommand("convert");
            item.addActionListener(listener);
            mnu.add(item);        
        mnuBar.add(mnu);
        //help
        mnu = new JMenu("Help");
            item = new JMenuItem("About");
            item.setActionCommand("about");
            item.addActionListener(listener);
            mnu.add(item);        
        mnuBar.add(mnu);
        //
        setJMenuBar(mnuBar);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand();
        processAction(action);
    }

    private void processAction(String action) {
        switch (action) {
            case "exit":
                exitApp();
                break;
            case "convert":
                showConverterPanel();
                break;
            case "about":
                showAboutDialog();
                break;
        }
    }

    private void showConverterPanel() {
        ConverterPanelRadioButton converterPanel = new ConverterPanelRadioButton(model);
        setContentPane(converterPanel);
        validate();
    }

    private void showAboutDialog() {
        JOptionPane.showMessageDialog(this, aboutMessage, "About", JOptionPane.INFORMATION_MESSAGE);
    }

}
