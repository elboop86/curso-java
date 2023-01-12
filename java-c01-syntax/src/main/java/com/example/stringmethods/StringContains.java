package com.example.stringmethods;

public class StringContains {

    public static void main(String[] args) {

        String text = "hola mundo y adios";

        boolean contains = text.contains("hola");
        System.out.println(contains);

        boolean start = text.startsWith("h");
        boolean end = text.endsWith("a");
    }
}
