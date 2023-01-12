package com.example;

public class Main {
    public static void main(String[] args) {

        String text = "hola mundo";
        int age = 20;

        // Crear OBJETO a partir de una CLASE

        // NombreClase nombreObjeto = new métodoconstructor();

        Employee employee1 = new Employee();
        employee1.name = "employee1";
        employee1.surname = "surname1";
        employee1.email = "emp1@example.com";
        employee1.nif = "8789654K";
        employee1.age = 30;
        employee1.salary = 2500.0d;

        Employee employee2 = new Employee("emp2");
        Employee employee3 = new Employee("emp3", "surname3");

        // Ctrl + P dentro de paréntesis muestra las distintas opciones disponibles
        Employee employee4 = new Employee("emp4", "surname", "88877796L", "emp4@email.com", 1000.0, 40);
    }
}