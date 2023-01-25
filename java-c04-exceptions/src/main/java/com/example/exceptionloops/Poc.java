package com.example.exceptionloops;

import java.util.Scanner;

/*
PoC - Proof Of Concept - Prueba de concepto

Probar qué pasa si se cierra y abre un Scanner, ello implica releer toda la consola si no habrá fallos
 */
public class Poc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double number;
        System.out.println("Introduce el valor double para: ");
        do {
            try {
                number = scanner.nextDouble();
                break;
            } catch(Exception e) {
                System.out.println("Formato incorrecto, introduce de nuevo el ");
                scanner.next(); // desplaza el scanner debajo del texto para que se pueda
                // leer de nuevo la entrada del usuario sin que se forme un ciclo infinito
            }
        } while(true);
//        scanner.close();

//        scanner = new Scanner(System.in);
        System.out.println("Introduce el valor double para: ");
        do {
            try {
                number = scanner.nextDouble();
                break;
            } catch(Exception e) {
                System.out.println("Formato incorrecto, introduce de nuevo el ");
                scanner.next(); // desplaza el scanner debajo del texto para que se pueda
                // leer de nuevo la entrada del usuario sin que se forme un ciclo infinito
            }
        } while(true);



        scanner.close();


    }
}
