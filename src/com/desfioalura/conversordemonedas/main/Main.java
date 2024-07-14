package com.desfioalura.conversordemonedas.main;

import com.desfioalura.conversordemonedas.method.Validate;
import com.desfioalura.conversordemonedas.currency.Currency;
import com.desfioalura.conversordemonedas.currency.CurrencyConverterService;

import java.util.Scanner;

public class Main extends Validate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverterService currencyService = new CurrencyConverterService();

        while (true) {
            System.out.println("=== Bienvenido a tu conversor de divisas ===");
            for (Currency currency : Currency.values()) {
                System.out.printf("%d. %s - %s%n", currency.ordinal() + 1, currency, currency.getDescription());
            }
            //Imprime en consola un menú con las descripciones de las divisisas disponibles en la clase "com.desfioalura.conversordemonedas.currency.Currency"

            System.out.println("8. Salir");

            int fromOption = getValidOption(scanner, "Selecciona el número de la divisa de origen o salir: ");
            if (fromOption == 8) {
                System.out.println("Gracias por utilizar nuestro servicio");
                System.out.println("Saliendo del programa...");
                break;
            }

            int toOption = getValidOption(scanner, "Selecciona el número de la divisa de destino o salir: ");
            if (toOption == 8) {
                System.out.println("Gracias por utilizar nuestro servicio");
                System.out.println("Saliendo del programa...");
                break;
            }

            double amount = getValidAmount(scanner);

            Currency fromCurrency = Currency.values()[fromOption - 1];
            Currency toCurrency = Currency.values()[toOption - 1];

            double result = currencyService.convertCurrency(fromCurrency, toCurrency, amount);
            if (result != -1) {
                System.out.printf("%.2f %s es igual a %.2f %s%n", amount, fromCurrency, result, toCurrency);
            } else {
                System.out.println("Error al convertir las divisas. Por favor, intenta nuevamente.");
            }
        }

        scanner.close();
    }
    //Metodo para validar las opciones del usuario y que el programa no se cierre si no es valida

}
