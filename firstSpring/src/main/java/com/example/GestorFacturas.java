package com.example;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GestorFacturas {
    CalculatorService calculatorService;
    String nombre;

    public GestorFacturas(CalculatorService calculatorService, @Value("Facturator 3000") String nombre) {
        System.out.println("Ejecutando constructor de GestorFacturas");
        this.nombre = nombre;
        this.calculatorService = calculatorService;

    }
}
