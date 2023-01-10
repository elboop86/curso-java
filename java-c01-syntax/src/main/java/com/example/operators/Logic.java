package com.example.operators;

public class Logic {

    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 10;

        // && (AND): comprueba que TODAS las condiciones sean verdaderas

        boolean result1 = number1 > 5 && number1 < 100;
        boolean result2 = number1 > 5 && number1 < 100 && number2 > 1 && number2 < 100;

        // || (OR): comprueba que AL MENOS UNA sea verdadera
    }
}
