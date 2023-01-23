package com.example.instanceofexample;

import com.example.interfaces2.Saludo;
import com.example.interfaces2.SaludoFormal;
import com.example.interfaces2.SaludoInformal;


/*
El operador instanceof permite saber si un objeto es de determinado tipo de dato

Por ejemplo si un objeto saludo es SaludoInformal o SaludoFormal
 */
public class Main {

    public static void main(String[] args) {

        Saludo saludo1 = new SaludoInformal();
        Saludo saludo2 = new SaludoFormal();

        // Comprobar si un objeto es de un tipo de dato en concreto
        // System.out.println(saludo1 instanceof String);
        System.out.println(saludo1 instanceof Saludo); // true
        System.out.println(saludo1 instanceof SaludoInformal); // true
        System.out.println(saludo1 instanceof SaludoFormal); // false

        System.out.println(saludo2 instanceof Saludo); // true
        System.out.println(saludo2 instanceof SaludoInformal); // false
        System.out.println(saludo2 instanceof SaludoFormal); // true
    }
}
