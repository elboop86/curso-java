package com.example.variables;

import java.util.Arrays;

public class ArrayDataStructure {

    public static void main(String[] args) {

        double price1 = 4.99d;
        double price2 = 3.99d;
        double price3 = 1.99d;

        double[] prices = new double[3];
        prices[0] = price1;
        prices[1] = price2;
        prices[2] = price3;
        // prices[3] = price3; // ArrayIndexOutOfBoundsException

        System.out.println(prices[1]);
        System.out.println(Arrays.toString(prices));

        double[] prices2 = {price1, price2, price3};
        System.out.println(Arrays.toString(prices2));
    }
}
