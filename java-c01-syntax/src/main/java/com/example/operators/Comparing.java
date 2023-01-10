package com.example.operators;

public class Comparing {

    public static void main(String[] args) {

        /*
        El resultado de los operadores de comparación es un boolean
         */

        int number1 = 5;
        int number2 = 5;
        String text1 = "hola";
        String text2 = "adios";

        // ==
        boolean areEquals = 5 == 5;
        boolean areEquals2 = number1 == number2;
        boolean areEquals3 = text1.equals(text2);

        // != distinto que
        boolean different = 5 != 10; // true porque son distintos
        boolean different1 = 5 != 5; // false porque son iguales, no son distintos

        // >=
        double price1 = 4.99;
        double price2 = 4.99;

        boolean greaterEqualsThan = price1 >= price2; // true

        // >
        boolean greaterThan = price1 > price2; // false


        // <=
        boolean lessEqualsThan = price1 <= price2;

        // <
        boolean lessThan = price1 < price2;

    }
}
