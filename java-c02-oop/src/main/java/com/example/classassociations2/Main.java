package com.example.classassociations2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Imprimir menú de opciones por consola
        System.out.println("""
                Welcome to Library App:
                1. Find all book
                2. Find one book
                3. Create a new book
                7. Add rating to book
                8. Show all ratings of one book
                9. Exit
                """);

        // option


        Book book1 = new Book();


        // 1. title
        String title = "Titulo libro";
        book1.setTitle(title);

        // 2. price
        Double price = 4.99;
        book1.setPrice(price);

        // 3. ratings
        String comment1 = "Espectacular";
        Double score1 = 3.0;
        Rating rating1 = new Rating(score1, comment1);
        book1.getRatings().add(rating1);

        // 4. author
        String authorName = "Roberto";
        String authorCountry = "Spain";
        Author author = new Author(null, authorName, authorCountry);
        book1.setAuthor(author);

        // 5. editorial
        String editorialName = "Planeta";
        String cif = "1233F";
        Editorial editorial = new Editorial(null, editorialName, cif);
        book1.setEditorial(editorial);


        // Opción utilizando el constructor
        Book book2 = new Book(null, title, price, author, editorial);
        book2.getRatings().add(rating1);
    }
}
