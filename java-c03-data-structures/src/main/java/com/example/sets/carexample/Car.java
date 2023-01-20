package com.example.sets.carexample;


import java.util.Objects;

public class Car {

    private String model;
    private Double price;
    // private Employee employee; // bidireccional porque la asociación está en ambas clases


    public Car() {
    }

    public Car(String model, Double price) {
        this.model = model;
        this.price = price;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(getModel(), car.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel());
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
