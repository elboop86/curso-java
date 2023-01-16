package com.example.staticmethods;

public class Main {

    public static void main(String[] args) {

        /*
        Las variables static y métodos static
        pueden ser accedidos sin necesidad de crear un objeto
        es decir
        utilizando la clase directamente.

        RESUMEN:
        si lleva static se accede desde la clase, no como objeto
         */

        // no hace falta crear un objeto para usar un método static
//        MathUtils utils = new MathUtils();
//        double result = utils.sum(5, 10);

        double result = MathUtils.sum(10, 10);

        // si el método no es static entonces es necesario crear un objeto
        // MathUtils.hello(); // error
        MathUtils utils = new MathUtils();
        System.out.println(utils.hello());
    }
}
