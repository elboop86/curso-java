package com.example.methods;

/**
 * Método: comportamiento asociado a un objeto. Contexto de programación orientada a objetos
 * Función: acción general
 *
 * Scope o alcance hace referencia a la sección que abarca la creacion de unas variables
 */
public class MethodsScope {


    public static void main(String[] args) {
        double result = calculateIVA(100);
        System.out.println(result);

        // number2 está en otra función, por lo tanto es otro alcance
        //System.out.println(number2);

        if(true) {
            int number3 = 5;
        }
        // number3 está en el alcance del bloque if, no podemos usarlo fuera
        // System.out.println(number3);

        for (int i = 0; i < 10; i++) {
            int number4 = 10; // alcance interno solamente del bucle for
            System.out.println(i);
        }

        // System.out.println(number4);
        // System.out.println(i);

        for (int i = 0; i < 10; i++) {
            int number4 = 10; // nuevo alcance, no da problemas con el for anterior
            // int number4 = 20; // mismo alcance, da problema
            System.out.println(i);
        }
    }

    private static double calculateIVA(int number) {
        number = 121;
        System.out.println(number);

        int number2 = 500;
        System.out.println(number2);

        return number;
    }


}
