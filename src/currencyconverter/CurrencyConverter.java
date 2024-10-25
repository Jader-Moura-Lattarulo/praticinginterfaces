package currencyconverter;

public class CurrencyConverter implements FinancialConversion{

    @Override
    public void convertDollarToReal(double dollar) {
        double dollarQuote = 5.7;
        double real = dollar * dollarQuote;

        System.out.printf("""
                **************************************************
                O valor de R$%.2f é equivalente a $%.2f dolar.
                **************************************************
                """, dollar, real);
    }
}
