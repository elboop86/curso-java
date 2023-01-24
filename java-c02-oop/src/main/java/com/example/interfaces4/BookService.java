package com.example.interfaces4;

import java.util.List;

/**
 * Interfaz para declarar las operaciones sobre objetos Book
 */
public interface BookService {

    // CRUD

    // Buscar todos los libros
    List<Book> findAll();

    // Buscar 1 libro por su id único
    Book findById(Long id);

    // Buscar por rango de páginas: 50 y 100
    List<Book> findAllByNumPagesBetween(int min, int max);

    // crear/guardar libro en base de datos
    Book create(Book book);

    // actualizar libro existente
    Book update(Book bookToUpdate);

    // borrar
    boolean removeById(Long id);

}
