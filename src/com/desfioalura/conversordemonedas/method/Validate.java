package com.desfioalura.conversordemonedas.method;

import java.util.Scanner;

public class Validate {
    ///Metodo para validar la opción elegida y que el programa no se cierre si no es valida
    public static int getValidOption(Scanner scanner, String prompt) {
        int option;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                if (option >= 1 && option <= 8) {
                    break;
                } else {
                    System.out.println("Por favor, ingresa un número válido entre 1 y 8.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingresa un número.");
                scanner.next(); // Limpiar entrada inválida
            }
        }
        return option;
    }
    //Metodo para validar la cantidad a convertir y que el programa no se cierre si no es valida
    public static double getValidAmount(Scanner scanner) {
        double amount;
        while (true) {
            System.out.print("Ingresa la cantidad a convertir: ");
            if (scanner.hasNextDouble()) {
                amount = scanner.nextDouble();
                if (amount > 0) {
                    break;
                } else {
                    System.out.println("Por favor, ingresa una cantidad positiva.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingresa un número.");
                scanner.next(); // Limpiar entrada inválida
            }
        }
        return amount;
    }
}
