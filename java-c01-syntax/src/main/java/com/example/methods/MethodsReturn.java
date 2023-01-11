package com.example.methods;


/*
Métodos que devuelven un resultado utilizando la palabra clave return
 */
public class MethodsReturn {

    public static final double IVA = 0.21;

    public static void main(String[] args) {
        double price1 = 4.99;
        double price2 = 7.99;

        // crear función que calcule el IVA de un parámetro precio y lo devuelva
        double priceWithIVA = calculateIVA(price1);
        System.out.println(priceWithIVA);

        // función suma
        double totalPrice = sum(price1, price2);
    }

    public static double calculateIVA(double price){
        return price + price * IVA;
    }

    public static double sum(double price1, double price2){
        return 0d;
    }



}
