package com.example.variables;


public class DataTypes {

    public static void main(String[] args) {

        /*
        Formato de nombrado en Java: camelCase
        Formato de nombrado en Python: snake_case
        Format de nombrado en C#: PascalCase
         */

        // 1. numéricos enteros
        byte number1 = 127;
        short number2 = 2;
        int number3 = 500000;
        long number4 = 3434343434787L;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number1 + " " + number2 + " " + number3 + " " + number4);

        // 2. numéricos decimales
        float number5 = 19.99f;
        double number6 = 129.99999999d;
        System.out.println(number5);
        System.out.println(number6);

        // 3. booleanos
        boolean validated = true;
        boolean isValid = false;
        System.out.println(validated);
        System.out.println(isValid);

        // 4. textos
        char characterA = 'a';
        String text = "Hola mundo";
        System.out.println(characterA);
        System.out.println(text);

    }
}
