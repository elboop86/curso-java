package com.example.wrappers;

public class Main {

    public static void main(String[] args) {

        /*
        Tipos envoltorio para envolver a los tipos primitivos
        Permiten utilizar valores null
         */

        // entero int
        int number0 = 1;
        Integer number1 = 1;
        Integer number2 = number0 + number1;
        System.out.println(number2);

        // entero long
        long number3 = 3L;
        Long number4 = 1L;

        // decimal float
        float number5 = 4.99f;
        Float number6 = 9.99f;

        // decimal double
        double number7 = 9.99d;
        Double number8 = 9.99d;

        // char: una sola letra, comilla simple '
        char letterA = 'A';
        Character letterB = 'B';

        // texto
        String text = "Hola mundo";

        // boolean
        boolean isValid1 = true;
        Boolean isValid2 = false;

        /*
        Los tipos envoltorio al ser clases proporcionan métodos para trabajar con su respectivo
        tipo de dato
         */

        Integer result = Integer.max(5, 10);
        System.out.println(result);

        String number = "10";
        Integer number10 = Integer.valueOf(number);
        System.out.println(number10);




    }
}
