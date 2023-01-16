package com.example.staticmethods;

/*
Clase con constantes y métodos static
 */
public class MathUtils {

    // constantes
    public static final double PI = 3.14;

    // atributos

    // constructores

    // métodos
    public static double sum(int num1, int num2){
        return num1 + num2;
    }

    public static double multiply(int num1, int num2){
        return num1 * num2;
    }

    // no es static, por lo tanto hay que crear un objeto
    public String hello(){
        return "hello";
    }
}
