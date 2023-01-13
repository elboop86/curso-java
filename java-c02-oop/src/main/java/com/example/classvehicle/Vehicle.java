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
    static final int MIN_SPEED = 0;

    // 2. atributos/propiedades
    String manufacturer;
    String model;
    double cc;
    String type;
    int speed;
    boolean status;
    double price;
    int year;

    // 3. constructores
    public Vehicle() {
    }
    public Vehicle(String manufacturer, String model, double cc, String type, int speed, boolean status, double price, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.cc = cc;
        this.type = type;
        this.speed = speed;
        this.status = status;
        this.price = price;
        this.year = year;
    }
    public Vehicle(String manufacturer, String model, double cc, String type) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.cc = cc;
        this.type = type;
        this.year = 1950; // valor por defecto para año de fabricación de los coches
        // no haría falta ponerles el valor por defecto,
        // ya que al ser datos primitivos ya se inicializan a 0 y false
        // this.speed = 0;
        // this.status = false;
    }

    // 4. métodos (comportamiento)
    public void speedUp(int quantity) {
        // si sumar quantity a speed supera 120 entonces se pone la velocidad en 120
        // si no, entonces se suma la cantidad
        if(this.speed + quantity > MAX_SPEED) // 120 + 50 = 170. No subir la velocidad
            this.speed = MAX_SPEED; // 120 límite superior
        else
            this.speed += quantity;
    }

    public void speedDown(int quantity) {
        if(this.speed - quantity < MIN_SPEED)
            this.speed = MIN_SPEED; // 0 límite inferior
        else
            this.speed -= quantity;

    }
    public void turnOn(){
        this.status = true;
    }
    public void turnOff(){
        this.status = false;
    }


    // NULL CHECKING: comprobar si un valor es nulo (null) antes de utilizarlo
    // para evitar excepciones NullPointerException

    // método que devuelva el modelo completo: Ford Fiesta 1.2 (1999)
    public String getFullName(){
        String manufacturer = "manufacturer";
        String model = "model";

        if(this.manufacturer != null)
            manufacturer = this.manufacturer;

        if(this.model != null)
            model = this.model;

        return manufacturer + " " + model + " " + this.cc;
    }

    // condicion ? valor_si : valor_no;
    // this.manufacturer != null ? this.manufacturer : "default"
//    public String getFullName(){
//        String manufacturer = this.manufacturer != null ? this.manufacturer : "defaultManufacturer";
//        String model = this.model != null ? this.model : "defaultModel";
//        return manufacturer + " " + model + " " + this.cc;
//    }


    // SOBRESCRITURA de métodos. Sobreescribe el método toString de la clase Object


    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", cc=" + cc +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                ", status=" + status +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
