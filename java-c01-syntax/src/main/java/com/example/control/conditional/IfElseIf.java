package com.example.control.conditional;

public class IfElseIf {

    public static void main(String[] args) {

        /*
         * if else if cuando hay más de dos condiciones
         */
        double price = 180.0d;

        if(price < 50){
            System.out.println("barato");
        } else if (price < 100) {
            System.out.println("medio");
        } else if (price < 150) {
            System.out.println("caro");
        } else {
            System.out.println("carísimo");
        }


        System.out.println("fin del programa");
    }
}
