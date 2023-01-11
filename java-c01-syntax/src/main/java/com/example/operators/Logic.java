package com.example.operators;

public class Logic {

    public static void main(String[] args) {

        /*
        Operadores lógicos: and y or
         */
        int number1 = 10;
        int number2 = 10;

        // && (AND): comprueba que TODAS las condiciones sean verdaderas

        boolean result1 = number1 > 5 && number1 < 100;
        boolean result2 = number1 > 5 && number1 < 100 && number2 > 1 && number2 < 100;

        // || (OR): comprueba que AL MENOS UNA sea verdadera
        boolean result3 = 5 < 10 || 20 < 15; // true || false

        // Combinar && (AND) y || (OR)
        boolean result4 = 5 < 5 || 50 <= 100 && 10 < 10;
        // false || true && false
        // true && false
        // false
        System.out.println(result4);

        boolean result5 = 5 < 5 || (50 <= 100 && 10 < 10);
        // false || true && false
        // true && false
        // false
        System.out.println(result5);
    }
}
