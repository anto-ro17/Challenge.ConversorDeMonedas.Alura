package com.desfioalura.conversordemonedas.currency;

public enum Currency {
    ARS("Peso argentino"),
    BOB("Bolivar boliviano"),
    BRL("Real brasileño"),
    CLP("Peso chileno"),
    COP("Peso colombiano"),
    USD("Dólar estadounidense"),
    MXN("Peso Mexicano");

    private String description;

    Currency(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
