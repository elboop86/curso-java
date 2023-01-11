package com.example.operators;

public class Increment {

    public static void main(String[] args) {

        int numero = 5;

        // ++ equivale a numero = numero + 1
        numero++;
        System.out.println(numero);


        // primero lo usa y luego lo incrementa
        System.out.println(numero++); // 6
        // como ya se incrementó ahora ya tiene el valor sumado
        System.out.println(numero); // 7

        System.out.println(numero + 1); // no incrementa solo hace la operación pero no la guarda

        /*
        // primero lo incrementa y luego lo usa
        System.out.println(++numero); // 7
        System.out.println(numero); // 7
        */


    }
}
