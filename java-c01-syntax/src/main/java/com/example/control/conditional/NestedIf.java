package com.example.control.conditional;

public class NestedIf {

    public static void main(String[] args) {

        double price = 5.0d;
//        String category = "Food";
//        String category = "Clothes";
        String category = "Books";

        if(category.equalsIgnoreCase("Food")) {

            if (price > 4.0 && price < 6.0) {
                System.out.println("comida barata");

            } else {
                System.out.println("comida cara");
            }

        } else if (category.equalsIgnoreCase("Clothes")){

            if (price < 30) {
                System.out.println("ropa barata");

            } else {
                System.out.println("ropa cara");
            }

        }
    }
}
