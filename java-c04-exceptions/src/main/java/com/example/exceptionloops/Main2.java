package com.example.exceptionloops;

import java.time.LocalDate;


/*
Fase 2: Delegar la lectura en una clase separada e invocarla desde Main

Guardamos las lecturas en variables y finalmente creamos un Book con esas variables
 */
public class Main2 {


    public static void main(String[] args) {

        ScannerReader reader = new ScannerReader();

        String title = reader.readString("title");
        String description = reader.readString("description");
        int numPages = reader.readInt("numPages");
        String isbn = reader.readString("isbn");
        String language = reader.readString("language");
        boolean available = reader.readBoolean("availability");
        double price = reader.readDouble("price");

        int day = reader.readInt("day");
        int month = reader.readInt("month");
        int year = reader.readInt("year");
        LocalDate endDate = LocalDate.of(year, month, day);

        Book book = new Book(null, title, description, numPages, isbn, language, available, price, LocalDate.now(), endDate);

        reader.close();
    }
}
