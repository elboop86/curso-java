package com.example.inheritance;

/*
MOTO
MotorCycle es una clase que extiende a la clase Vehicle, posibles nomenclaturas:

- Clase hija
- Clase derivada
- Subclase

La clase superior Vehicle se llama:

- Clase padre
- Clase base
- Superclase

La herencia usa extends
Las interfaces usan implements
 */
public class MotorCycle extends Vehicle {

    private Boolean hasCopilot;
    private Integer boxCapacityLiters;

    public MotorCycle() {
    }

    public MotorCycle(Long id, Integer numWheels, String color, Double weight, Boolean hasCopilot, Integer boxCapacityLiters) {
        super(id, numWheels, color, weight);
        this.hasCopilot = hasCopilot;
        this.boxCapacityLiters = boxCapacityLiters;
    }

    public Boolean getHasCopilot() {
        return hasCopilot;
    }

    public void setHasCopilot(Boolean hasCopilot) {
        this.hasCopilot = hasCopilot;
    }

    public Integer getBoxCapacityLiters() {
        return boxCapacityLiters;
    }

    public void setBoxCapacityLiters(Integer boxCapacityLiters) {
        this.boxCapacityLiters = boxCapacityLiters;
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                "id=" + this.getId() +
                ", numWheels=" + this.getNumWheels() +
                ", color='" + this.getColor() + '\'' +
                ", weight=" + this.getWeight() +
                "hasCopilot=" + hasCopilot +
                ", boxCapacityLiters=" + boxCapacityLiters +
                "} " + super.toString();
    }
}
