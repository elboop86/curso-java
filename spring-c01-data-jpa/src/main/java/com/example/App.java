package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class App {

	public static void main(String[] args) {


		// 1. Inicializa Spring
		ApplicationContext spring = SpringApplication.run(App.class, args);

		// 2. Crear objeto BookRepository (lo crea Spring)
		// BookRepository bookRepository = new BookRepository();
		BookRepository bookRepository = spring.getBean(BookRepository.class);

		// 3. Crear y guardar un libro en base de datos
		Book book1 = new Book(null, "book1", 9.99, 150);
		bookRepository.save(book1);

		// 4. Recuperar libros de base de datos
		List<Book> books = bookRepository.findAll();
		System.out.println(books);





	}

}
