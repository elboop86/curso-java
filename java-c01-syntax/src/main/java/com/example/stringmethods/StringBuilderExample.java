package com.example.stringmethods;

public class StringBuilderExample {

    public static void main(String[] args) {

        /*
        Los String en java, internamente son inmutables, es decir, final.
        Cada vez que se cambia un String, se tiene que crear uno nuevo, y eso ocupa memoria.
         */
        // Opción no óptima
        String text = "Book: ";
        for (int i = 0; i < 10; i++) {
            text += "test";
        }

        // Opción óptima
        StringBuilder builder = new StringBuilder("book");
        for (int i = 0; i < 10; i++) {
            builder.append("hola");
        }
        String resultado = builder.toString();
    }
}
