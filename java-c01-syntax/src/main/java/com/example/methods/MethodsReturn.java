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
        System.out.println(totalPrice);

        // función multiplicación
        double total = multiply(10, 20);
        System.out.println(total);

        // devolver mensaje de bienvenida para un nombre concreto
        String text = getMessage("Alan");
        System.out.println(text);

        text = getMessage("");
        System.out.println(text);
    }

    public static double calculateIVA(double price){
        // comentario
        return price + price * IVA;
    }

    public static double sum(double price1, double price2){
        /*
        Comentario multilínea
         */
        return price1 + price2;
    }

    /**
     * Función que multiplica dos números double
     * @param number1 double mayor que cero
     * @param number2 double mayor que cero
     * @return double resultado de la multiplicación
     */
    public static double multiply(double number1, double number2){
        return number1 * number2;
    }

    public static String getMessage(String name){
        boolean isEmpty = name.length() == 0;

        if(isEmpty) {
            System.out.println("Se cumple el IF");
            return "Welcome user";
        }

        return "Welcome " + name;
    }

}
