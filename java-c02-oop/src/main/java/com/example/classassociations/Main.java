package com.example.classassociations;

public class Main {

    public static void main(String[] args) {

        // Crear 3 habitaciones
        Room room1 = new Room(10, 1, true);
        Room room2 = new Room(10, 2, false);
        Room room3 = new Room(10, 0, true);

        // Crear 1 casa
        Room[] rooms = {room1, room2, room3};
        House house1 = new House(50, 100000d, EnergyLevel.LEVEL_0, rooms);
        House house2 = new House(50, 100000d, EnergyLevel.LEVEL_0, new Room[]{room1, room2, room3});

        // m2 DE LAS HABITACIONES
        int roomsM2 = house1.calculateM2Rooms();
        System.out.println("Metros cuadrados totales ocupados por las habitaciones: " + roomsM2);

        // m2 DEL RESTO DE LA CASA: pasillos, escaleras, descansillo...
        int hallsM2 = house1.calculateM2Halls();
        System.out.println("Metros cuadrados totales ocupados por pasillos: " + hallsM2);


    }
}
