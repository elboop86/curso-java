package com.example.control.repetitive;

public class For {

    public static void main(String[] args) {

        /*
        Estructuras de control repetitivo permiten repetir un código

        for(inicio; fin; paso)
         */


        // de menos a más con paso 1

//        for(int i = 0; i < 1_000_000; i++)
//            System.out.println("Número: " + i);


        // de menos a más con paso 2
//        for (int i = 0; i < 20; i+=2) {
//            System.out.println("Número: " + i);
//        }

        // de más a menos con paso 1
        for (int i = 20; i > 0; i--) {
            System.out.println("Número: " + i);
        }

    }
}
