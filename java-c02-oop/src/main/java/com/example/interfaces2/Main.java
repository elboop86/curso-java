package com.example.interfaces2;

public class Main {

    public static void main(String[] args) {

        // abstracto            concreto
        Saludo saludo = new SaludoInformal();
        // Saludo saludo = new SaludoFormal();

        saludo.saludar();
    }
}
