package org.firstSpring;

public class GestorFacturas {
    CalculatorService calculatorService;
    String nombre;

    public GestorFacturas(CalculatorService calculatorService, String nombre) {
        System.out.println("Ejecutando constructor de GestorFacturas");
        this.nombre = nombre;
        this.calculatorService = calculatorService;
    }
}
