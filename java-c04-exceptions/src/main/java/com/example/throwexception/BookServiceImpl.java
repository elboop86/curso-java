package com.example.throwexception;

import com.example.throwexception.exception.BookNotFoundException;
import com.example.throwexception.exception.InvalidBookData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {


    private List<Book> database = new ArrayList<>();

    public BookServiceImpl(){
        Book book1 = new Book(null, "book1", "d1", 200, "111A", "spanish", true, 20.0, LocalDate.now(), null);
        Book book2 = new Book(null, "book2", "d2", 150, "BBBA", "spanish", true, 20.0, LocalDate.now(), null);
        Book book3 = new Book(null, "book3", "d3", 100, "CCCA", "spanish", true, 20.0, LocalDate.now(), null);
        try {
            this.create(book1);
            this.create(book2);
            this.create(book3);
        } catch(InvalidBookData e){
            System.out.println("No se ha podido inicializar la base de datos de libros");
        }
    }


    @Override
    public List<Book> findAll() {
        return new ArrayList<>(database);
    }


    @Override
    public Book findById(Long id) {

        // Programación defensiva: fallar temprano para evitar errores colaterales o errores en otros lugares que dificulten encontrar el error real
        if (id == null || id <= 0)
            throw new IllegalArgumentException("El id no puede ser nulo o menor o igual que cero");

        for (Book book : database) {
            if (book.getId() == id) {
                return book;
            }
        }

        // EXCEPCIÓN NO COMPROBADA: no obliga poner throws en el método ni a capturar
//        throw new NoSuchElementException("No se ha encontrado el libro solicitado");
        throw new BookNotFoundException("No se ha encontrado el libro solicitado");
    }

    @Override
    public List<Book> findAllByNumPagesBetween(int min, int max) {
        List<Book> filteredBooks = new ArrayList<>();

        if (min <= 0) // límite inferior
            return filteredBooks;

        if (max <= 0) // límite superior
            return filteredBooks;

        if (min >= max) // comprobar que no se hayan intercambiado
            return filteredBooks;

        for (Book book : database) {
            if (book.getNumPages() >= min && book.getNumPages() <= max) {
                filteredBooks.add(book);
            }
        }

        return filteredBooks;
    }

    @Override
    public Book create(Book book) throws InvalidBookData {
        if (book.getId() != null)
            return null;

        // Validar el libro: comprobar título, número mínimo de pages

        // EXCEPCIÓN COMPROBADA: obliga a poner throws
        if(book.getTitle().isEmpty() || book.getTitle().length() < 3)
            throw new InvalidBookData("Título no pueder vacío o inferior a 50 caracteres");

        if(book.getPrice() == null || book.getPrice() <= 0 || book.getPrice() >= 500.0)
            throw new InvalidBookData("Precio debe ser mayor que cero y menor que 500");

        Long id = this.generateId();
        book.setId(id);
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
    public Book update(Book bookToUpdate) {
        // Comprobar que ya tiene un id
        if (bookToUpdate.getId() == null)
            return null; // entonces es una creación

        // encontrar el libro y modificarlo
        for (Book book : database) {
            if (book.getId() == bookToUpdate.getId()) {
                // cambiar solo aquellos atributos que nos interesen en lugar de sustituir el objeto entero
                book.setTitle(bookToUpdate.getTitle());
                book.setDescription(bookToUpdate.getDescription());
                book.setNumPages(bookToUpdate.getNumPages());
                book.setAvailable(bookToUpdate.getAvailable());
                book.setPrice(bookToUpdate.getPrice());
                book.setEndDate(bookToUpdate.getEndDate());
                return book;
            }
        }

        return null;
    }

    @Override
    public boolean removeById(Long id) {

        for (Book book : database) {
            if (book.getId() == id) {
                database.remove(book);
                return true;
            }
        }
        return false;

    }
}
