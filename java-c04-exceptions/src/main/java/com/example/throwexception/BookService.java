package com.example.throwexception;

import com.example.throwexception.exception.InvalidBookData;

import java.util.List;


public interface BookService {

    // Ejemplo1: Lanza una excepción NO comprobada por el compilador
    Book findById(Long id);

    // Ejemplo2: Lanza una excepción SI comprobada por el compilador
    Book create(Book book) throws InvalidBookData;





    List<Book> findAll();
    List<Book> findAllByNumPagesBetween(int min, int max);
    Book update(Book bookToUpdate);
    boolean removeById(Long id);

}
