package com.example.inheritance;

/*

COCHE
Car es una clase que extiende a la clase Vehicle, posibles nomenclaturas para Car:

- Clase hija
- Clase derivada
- Subclase

La clase superior Vehicle se llama:

- Clase padre
- Clase base
- Superclase
 */
public class Car extends Vehicle {

    // atributos específicos de coches
    private Integer numDoors;
    private Integer numPassengers;

    // constructores
    public Car() {
    }
    public Car(Long id, Integer numWheels, String color, Double weight, Integer numDoors, Integer numPassengers) {
        super(id, numWheels, color, weight); // super invoca el constructor de la clase Vehicle
        this.numDoors = numDoors;
        this.numPassengers = numPassengers;
    }

    // getter y setter


    public Integer getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(Integer numDoors) {
        this.numDoors = numDoors;
    }

    public Integer getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(Integer numPassengers) {
        this.numPassengers = numPassengers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + this.getId() +
                ", numWheels=" + this.getNumWheels() +
                ", color='" + this.getColor() + '\'' +
                ", weight=" + this.getWeight() +
                "numDoors=" + numDoors +
                ", numPassengers=" + numPassengers +
                "} ";
    }
}
