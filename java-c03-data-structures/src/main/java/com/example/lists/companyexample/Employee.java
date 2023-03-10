package com.example.lists.companyexample;

import java.util.ArrayList;

public class Employee {

    private String name;
    private String nif;
    private ArrayList<Car> cars = new ArrayList<>();

    public Employee() {
    }

    public Employee(String name, String nif, ArrayList<Car> cars) {
        this.name = name;
        this.nif = nif;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", nif='" + nif + '\'' +
                ", cars=" + cars +
                '}';
    }
}
