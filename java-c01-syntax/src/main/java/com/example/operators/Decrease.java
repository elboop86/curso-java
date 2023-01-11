package com.example.operators;

public class Decrease {

    public static void main(String[] args) {
        int numero = 5;

        // -- equivale a numero = numero - 1
        numero--;
        System.out.println(numero); // 4


        // primero lo usa y luego le resta 1
        System.out.println(numero--); // 4

        // como ya se incrementó ahora ya tiene el valor sumado
        System.out.println(numero); // 3

        System.out.println(numero - 1); // 2 no incrementa solo hace la operación pero no la guarda

        /*
        // primero lo decrementa y luego lo usa
        System.out.println(--numero);
        System.out.println(numero);
        */

    }
}
