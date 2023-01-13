package com.example.classvehicle;

public class Main {

    public static void main(String[] args) {

        System.out.println("Velocidad máxima: " + Vehicle.MAX_SPEED);

        Vehicle fordFiesta = new Vehicle("Ford", "Fiesta", 1.2, "SEDAN", 0, false);
        System.out.println(fordFiesta.manufacturer);

        Vehicle alfaRomeo = new Vehicle("Alfa Romeo", "149", 1.9, "SEDAN");

        // los métodos cambian el estado del vehículo es decir,
        // los valores de sus atributos
        alfaRomeo.turnOn();

        alfaRomeo.speedUp(50);

        alfaRomeo.speedUp(100);

        alfaRomeo.speedDown(40);

        alfaRomeo.speedDown(40);

        alfaRomeo.turnOff();

        // TODO imprimir modelo completo
        // TODO agregar precio
    }
}
