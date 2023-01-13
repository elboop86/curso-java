package com.example.classvehicle;

public class MainToString {

    public static void main(String[] args) {

        Vehicle honda = new Vehicle("Honda", "civic", 2.1, "SEDAN", 0, false, 2000.0, 2000);
        System.out.println(honda.manufacturer);
        System.out.println(honda.model);
        System.out.println(honda.price);
        System.out.println(honda);

        Vehicle alfaRomeo = new Vehicle();
        System.out.println(alfaRomeo);
    }
}
