
package cat.proven.currencyconverter;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomePanel extends JPanel {

    private String welcomeMessage;
    
    public WelcomePanel() {
        welcomeMessage = "<html><p>Welcome to Currency converter</p><p>(c)ProvenSoft 2021</p></html>";
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        JLabel lbWelcome = new JLabel();
        lbWelcome.setText(welcomeMessage);
        add(lbWelcome, BorderLayout.CENTER);
    }
    
}
