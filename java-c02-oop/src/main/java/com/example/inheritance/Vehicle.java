package com.example.inheritance;

public class Vehicle {

    private Long id;
    private Integer numWheels;
    private String color;
    private Double weight;

    public Vehicle() {
    }

    public Vehicle(Long id, Integer numWheels, String color, Double weight) {
        this.id = id;
        this.numWheels = numWheels;
        this.color = color;
        this.weight = weight;
    }

    public void speedUp(){
        System.out.println("Acelerar!");
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(Integer numWheels) {
        this.numWheels = numWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle {" +
                "id=" + id +
                ", numWheels=" + numWheels +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
