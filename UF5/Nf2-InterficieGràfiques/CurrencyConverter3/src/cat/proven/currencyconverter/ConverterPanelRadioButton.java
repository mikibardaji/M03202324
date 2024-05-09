
package cat.proven.currencyconverter;

import cat.proven.currencyconverter.model.CurrencyConverter;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ConverterPanelRadioButton extends JPanel implements ActionListener {

    private JTextField tfInputCoin;
    private JTextField tfOutputCoin;
    JRadioButton euroDolar;
    JRadioButton Dolareuro;
    private ActionListener listener;
    private final CurrencyConverter model;

    public ConverterPanelRadioButton(CurrencyConverter model) {
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
        form.setLayout(new GridLayout(2, 2));
        tfInputCoin = new JTextField(20);
        tfOutputCoin = new JTextField(20);
        tfOutputCoin.setEditable(false);
        //JLabel lbDollar = new JLabel("dollars");
        //JLabel lbEuro = new JLabel("euros");
        JButton btDE = new JButton("Convert");
        btDE.setActionCommand("Convert");
        btDE.addActionListener(listener);
        //JButton btED = new JButton("Euro->Dollar");
        //btED.setActionCommand("euro2dollar");
        //btED.addActionListener(listener);
        form.add(tfInputCoin);  // form.add(lbDollar);
        form.add(btDE);  // form.add(btED);
        form.add(tfOutputCoin);  // form.add(lbEuro);
        euroDolar = new JRadioButton("Euro to Dollar");
        Dolareuro = new JRadioButton("Dollar to Euro");
        ButtonGroup grupo_botones = new ButtonGroup();
        grupo_botones.add(euroDolar);
        grupo_botones.add(Dolareuro);
        JPanel panel = new JPanel(new GridLayout(1, 2));
        panel.add(euroDolar);
        panel.add(Dolareuro);
        form.add(panel);
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
            case "Convert":
                if (Dolareuro.isSelected())
                {
                convertDollarToEuro();
                }
                else if (euroDolar.isSelected())
                {
                convertEuroToDollar();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "RadioButton is not selected");
                }
                break;
        //    case "euro2dollar":
        //        convertEuroToDollar();
        //        break;
        }
    }

    private void convertEuroToDollar() {
        String sEuro = tfInputCoin.getText();
        try {
            double euro = Double.parseDouble(sEuro);
            double dollar = model.euroToDollar(euro);
            tfOutputCoin.setText(String.valueOf(dollar)+" $");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Bad value");
        }        
    }

    private void convertDollarToEuro() {
        String sDollar = tfInputCoin.getText();
        try {
            double dollar = Double.parseDouble(sDollar);
            double euro = model.dollarToEuro(dollar);
            tfOutputCoin.setText(String.valueOf(euro)+" €");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Bad value");
        }
    }
    
}
