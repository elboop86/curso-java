package com.example.methods;


public class MethodsOverload {

    public static void main(String[] args) {

        /*
        Sobrecarga de métodos
        Se puede repetir un método pero con distintos parámetros.
         */
        printHello();
        printHello("Alan");
        printHello("Alan", "Sastre");
        printHello("Juan", 30);
        printHello("Juan", 3000.0);
    }

    private static void printHello() {
    }
    private static void printHello(String name) {
    }
    private static void printHello(String name, String surname) {
    }
    private static void printHello(String name, int age) {
    }
    private static void printHello(String name, double salary) {

    }
}
