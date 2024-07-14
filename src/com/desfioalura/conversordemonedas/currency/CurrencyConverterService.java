package com.desfioalura.conversordemonedas.currency;

public class CurrencyConverterService {
    private CurrencyAPIClient currencyAPIClient;

    public CurrencyConverterService() {
        this.currencyAPIClient = new CurrencyAPIClient();
    }

    public double convertCurrency(Currency fromCurrency, Currency toCurrency, double amount) {
        double exchangeRate = currencyAPIClient.getExchangeRate(fromCurrency, toCurrency);
        if (exchangeRate != -1) {
            return amount * exchangeRate;
        } else {
            return -1;
        }
    }
}
