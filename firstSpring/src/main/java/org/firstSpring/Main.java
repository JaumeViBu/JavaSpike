package org.firstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //Ejemplo 1
        //opcion 1. Crear objeto de forma normal
        //CalculatorService sercice = new CalculatorService();

        //opcion 2. Recibir un objeto de Spring
        CalculatorService calculadora = (CalculatorService) context
                .getBean("calculatorService");

        String texto = calculadora.holaMundo();
        System.out.println(texto);

        //EJemplo 2
        GestorFacturas gestor=(GestorFacturas) context.getBean("gestorFacturas");

        System.out.println(gestor.calculatorService.holaMundo());
    }
}