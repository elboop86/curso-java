package com.example.interfaces4;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {

    // Base de datos
    private List<Book> database = new ArrayList<>();
    private Long id = 0L;

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(database);
    }

    @Override
    public Book findById(Long id) {

        for (Book book : database){
            if (book.getId() == id){
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> findAllByNumPagesBetween(int min, int max) {
        List<Book> filteredBooks = new ArrayList<>();

        if(min <= 0) // límite inferior
            return filteredBooks;

        if(max <= 0) // límite superior
            return filteredBooks;

        if(min >= max) // comprobar que no se hayan intercambiado
            return filteredBooks;

        for (Book book : database) {
            if(book.getNumPages() >= min && book.getNumPages() <= max) {
                filteredBooks.add(book);
            }
        }

        return filteredBooks;
    }

    @Override
    public Book create(Book book) {
        // Comprobar que no tiene ya un id asignado
        if (book.getId() != null)
            return null;

        // Validar el libro: comprobar título, número mínimo de pages

        // Generar un id para el nuevo libro
        Long id = this.generateId();
        book.setId(id);
//        book.setId(++id);

        // Primera iteración: id = 1
        // Segunda iteración: id = 2
        // Tercera iteración: id = 3

        // Almacenar el libro en la estructura de datos
        database.add(book);

        return book;
    }

    /*
    Detectar el mayor id en uso
    Sumarle 1 y devolverlo, ese sería el nuevo id disponible
     */
    private Long generateId() {
        Long id = 0L;
        for (Book book : database)
            id = Math.max(id, book.getId());

        return id + 1;
    }

    @Override
    public Book update(Book book) {
        return null;
    }

    @Override
    public boolean removeById(Long id) {
        return false;
    }
}
