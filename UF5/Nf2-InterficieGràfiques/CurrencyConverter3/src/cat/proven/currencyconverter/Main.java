
package cat.proven.currencyconverter;

import cat.proven.currencyconverter.model.CurrencyConverter;
import javax.swing.SwingUtilities;


public class Main {

    public static void main(String[] args) {
        //instantiate model.
        CurrencyConverter model = new CurrencyConverter();
        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame(model);
            mainFrame.setVisible(true);
        });
    }
    
}
