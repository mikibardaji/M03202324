package cat.proven.currencyconverter.model;

public class CurrencyConverter {

    private double ratioDollarEuro = 0.8828; //1 dollar = 0.8828 euros

    public double dollarToEuro(double amount) {
        return amount * ratioDollarEuro;
    }

    public double euroToDollar(double amount) {
        return amount / ratioDollarEuro;
    }

}
