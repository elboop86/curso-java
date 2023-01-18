package com.example.classproduct;

public class Product {

    // atributos
    private String name;
    private Double price;
    private Integer quantity;
    private String color;
    private Integer weight;
    private Manufacturer manufacturer;

    // constructores
    public Product() {
    }

    // Otra opción: se pueden inicializar los atributos utilizando setter en caso de que haya comprobaciones
    public Product(String name, Double price, Integer quantity, String color, Integer weight, Manufacturer manufacturer) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.weight = weight;
        this.manufacturer = manufacturer;
    }

    // getter setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
// tostring

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
