package com.example.control.repetitive;

public class ForEach {

    public static void main(String[] args) {

        /*
        for (tipodedato nombrevariable : nombreestructuradatos)
         */

        String[] names = {"person1", "person2", "person3", "person4", "person5"};
        for (String name : names) {
            System.out.println(name);
        }

        double[] prices = {5.99, 3.99, 2.11};
        for (double price : prices) {
            System.out.println(price);
        }
    }
}
