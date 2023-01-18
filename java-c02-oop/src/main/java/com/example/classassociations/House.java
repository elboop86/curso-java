package com.example.classassociations;


public class House {

    // atributos
    private Integer m2;
    private Double price;
    private EnergyLevel energyLevel;
    // asociaciones
    private Room[] rooms;

    // constructores

    public House() {
    }

    public House(Integer m2, Double price, EnergyLevel energyLevel, Room[] rooms) {
        this.m2 = m2;
        this.price = price;
        this.energyLevel = energyLevel;
        this.rooms = rooms;
    }

    // getter setter


    public Integer getM2() {
        return m2;
    }

    public void setM2(Integer m2) {
        this.m2 = m2;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public EnergyLevel getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(EnergyLevel energyLevel) {
        this.energyLevel = energyLevel;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "m2=" + m2 +
                ", price=" + price +
                ", energyLevel=" + energyLevel +
                '}';
    }

    public int calculateM2Rooms() {
        int totalM2 = 0;

        for (Room room: this.getRooms()) {
            if(room.getM2() != null)
                totalM2 += room.getM2();
        }

        return totalM2;
    }

    public int calculateM2Halls(){

        return m2 - this.calculateM2Rooms();
    }
}
