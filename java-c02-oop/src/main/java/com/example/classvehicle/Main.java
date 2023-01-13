package com.example.classvehicle;

public class Main {

    public static void main(String[] args) {

        System.out.println("Velocidad máxima: " + Vehicle.MAX_SPEED);

        Vehicle fordFiesta = new Vehicle("Ford", "Fiesta", 1.2, "SEDAN", 0, false);

        Vehicle alfaRomeo = new Vehicle("Alfa Romeo", "149", 1.9, "SEDAN");


    }
}
