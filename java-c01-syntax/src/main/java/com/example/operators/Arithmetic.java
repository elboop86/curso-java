package com.example.operators;

public class Arithmetic {

    public static void main(String[] args) {

        int number1 = 5;
        int number2 = 10;

        int sum = number1 + number2;
        System.out.println(sum); // 15

        int sumTotal = sum + 5; // 20 gastos de envío
        sumTotal = sumTotal + 5; // 25 gastos de gestión
        System.out.println(sumTotal);

        int subs = number1 - number2;
        System.out.println(subs); // -5

        int prod = number1 * number2;
        System.out.println(prod); // 50

        int division = number1 / number2;
        System.out.println(division); // 0

        float divisionFloat = (float) number1 / number2;
        System.out.println(divisionFloat); // 0.5

        double divisionDouble = (double) number1 / number2;
        System.out.println(divisionDouble); // 0.5

        int modulus = number2 % 2;
        System.out.println(modulus);
    }
}
