package com.example.methods;

public class Methods {


    public static void main(String[] args) {

        printHello();
        printText("hola mundo");
        printNameAndText("Alan", "Bienvenido a Java.");
        printNameAndSurnameAndText("Alan", "Sastre", "Bienvenido a Java.");

    }

    public static void printHello(){
        System.out.println("Hello");
    }
    public static void printText(String text){
        System.out.println(text);
    }
    public static void printNameAndText(String name, String text) {
        System.out.println("Hola " + name + " " + text);
    }
    public static void printNameAndSurnameAndText(String name, String surname, String text){
        System.out.println("Hola " + name + " " + surname + " " + text);
    }






































}
