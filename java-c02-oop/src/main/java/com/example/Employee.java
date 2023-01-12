package com.example;

public class Employee {

    // atributos/propiedades
    String name;
    String surname;
    String nif;
    String email;
    double salary;
    int age;

    // constructores: métodos especiales para construir objetos de la clase
    public Employee(){
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String surname){
        // this palabra reservada para acceder a atributos/métodos de la propia clase
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, String nif,
                    String email, double salary, int age) {
        this.name = name;
        this.surname = surname;
        this.nif = nif;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }




    // comportamiento (métodos)

}
