package com.example.classvehicle;

/**
this permite diferenciar entre un atributo y un parámetro/argumento

 1. constantes
 2. atributos
 3. constructores
 4. métodos
 */
public class Vehicle {

    // 1. constantes
    static final int MAX_SPEED = 120;

    // 2. atributos/propiedades
    String manufacturer;
    String model;
    double cc;
    String type;
    int speed;
    boolean status;

    // 3. constructores
    public Vehicle() {
    }
    public Vehicle(String manufacturer, String model, double cc, String type, int speed, boolean status) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.cc = cc;
        this.type = type;
        this.speed = speed;
        this.status = status;
    }
    public Vehicle(String manufacturer, String model, double cc, String type) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.cc = cc;
        this.type = type;
        // no haría falta ponerles el valor por defecto,
        // ya que al ser datos primitivos ya se inicializan a 0 y false
        // this.speed = 0;
        // this.status = false;
    }

    // 4. métodos
    public void speedUp(int quantity) {
         this.speed += quantity;
    }

    public void speedDown(int quantity) {
        this.speed -= quantity;
    }
}
