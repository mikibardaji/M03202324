
package cat.proven.currencyconverter;

import cat.proven.currencyconverter.model.CurrencyConverter;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ConverterPanel extends JPanel implements ActionListener {

    private JTextField tfDollar;
    private JTextField tfEuro;
    private ActionListener listener;
    private final CurrencyConverter model;

    public ConverterPanel(CurrencyConverter model) {
        this.model = model;
        listener = this;
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        JLabel header = new JLabel("Euro-Dollar converter");
        header.setHorizontalAlignment(SwingConstants.CENTER);
        add(header, BorderLayout.NORTH);
        JPanel form = new JPanel();
        form.setLayout(new GridLayout(3, 2));
        tfDollar = new JTextField(20);
        tfEuro = new JTextField(20);
        JLabel lbDollar = new JLabel("dollars");
        JLabel lbEuro = new JLabel("euros");
        JButton btDE = new JButton("Dollar->Euro");
        btDE.setActionCommand("dollar2euro");
        btDE.addActionListener(listener);
        JButton btED = new JButton("Euro->Dollar");
        btED.setActionCommand("euro2dollar");
        btED.addActionListener(listener);
        form.add(tfDollar);   form.add(lbDollar);
        form.add(btDE);   form.add(btED);
        form.add(tfEuro);   form.add(lbEuro);
        add(form, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand();
        processAction(action);
        //System.out.println("Executing: "+action);  //TODO remove for production
    }

    private void processAction(String action) {
        switch (action) {
            case "dollar2euro":
                convertDollarToEuro();
                break;
            case "euro2dollar":
                convertEuroToDollar();
                break;
        }
    }

    private void convertEuroToDollar() {
        String sEuro = tfEuro.getText();
        try {
            double euro = Double.parseDouble(sEuro);
            double dollar = model.euroToDollar(euro);
            tfDollar.setText(String.valueOf(dollar));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Bad value");
        }        
    }

    private void convertDollarToEuro() {
        String sDollar = tfDollar.getText();
        try {
            double dollar = Double.parseDouble(sDollar);
            double euro = model.dollarToEuro(dollar);
            tfEuro.setText(String.valueOf(euro));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Bad value");
        }
    }
    
}
