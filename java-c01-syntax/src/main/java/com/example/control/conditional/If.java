package com.example.control.conditional;

public class If {

    public static void main(String[] args) {

        boolean isValid = true;

        // if sin llaves (solo cuando hay una línea dentro de if)
        if (isValid)
            System.out.println("Es verdadero");

        // if con llaves
        if (isValid) {
            System.out.println("Es verdadero");
            System.out.println("Es verdadero");
        }

        // if else sin llaves. Ejecuta una de las dos pero no las dos
        if (isValid)
            System.out.println("Es verdadero");
        else
            System.out.println("Es falso");


        // if else con llaves
        if (isValid) {
            System.out.println("Es verdadero");
            System.out.println("Es verdadero");
        } else {
            System.out.println("Es falso");
            System.out.println("Es falso");
        }

        // operador ternario
        // condicion ? valor_si : valor_no;
        double price = 20.0d;
        double shipCost = price > 100.0d ? 0d : 5.5d;
        System.out.println(shipCost);


        // comparación ==
        double number1 = 5.0d;
        double number2 = 10.0d;

        if(number1 == number2){
            System.out.println("Numeros iguales");
        }
    }
}
