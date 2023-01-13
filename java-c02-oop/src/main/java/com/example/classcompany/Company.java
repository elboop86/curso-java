package com.example.classcompany;

public class Company {

    // constantes

    // atributos
    String name;
    String cif;
    double income;
    String phone;

    // constructores: método especial para construir y que tener SOBRECARGA
    public Company() {}

    public Company(String name, String cif, double income, String phone) {
        this.name = name;
        this.cif = cif;
        this.income = income;
        this.phone = phone;
    }

    public Company(String name, String cif) {
        this.name = name;
        this.cif = cif;
    }

    // métodos
}

