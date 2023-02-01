package com.example;

import com.example.entities.Address;
import com.example.entities.Author;
import com.example.entities.Book;
import com.example.entities.Employee;
import com.example.repositories.AddressRepository;
import com.example.repositories.AuthorRepository;
import com.example.repositories.BookRepository;
import com.example.repositories.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		System.out.println("==================== INICIALIZAR SPRING ====================");
		ApplicationContext spring = SpringApplication.run(App.class, args);



		// EJEMPLO CRUD DE BOOKS

		// Crear objeto BookRepository (lo crea Spring)
		// BookRepository bookRepository = new BookRepository();
		BookRepository bookRepository = spring.getBean(BookRepository.class);


		// Crear y guardar un libro en base de datos
		System.out.println("==================== SAVE BOOK ====================");
		Book book1 = new Book(null, "book1", 9.99, 150);
		Book book2 = new Book(null, "book2", 19.99, 366);
		Book book3 = new Book(null, "book3", 29.99, 450);
		bookRepository.save(book1); // 1
		bookRepository.save(book2); // 2
		bookRepository.save(book3); // 3


		// Recuperar libros de base de datos
		System.out.println("==================== FIND ALL BOOKS ====================");
		List<Book> books = bookRepository.findAll();
		System.out.println(books);


		System.out.println("==================== UPDATE BOOK ====================");
		// para actualizar hay que pasar un objeto libro con un id que ya exista
		book1.setPrice(15.47);
		bookRepository.save(book1);

		book2.setNumPages(421);
		bookRepository.save(book2);



		// Borrar un libro por su id
		System.out.println("==================== DELETE BY ID BOOK ====================");
		bookRepository.deleteById(2L);

		// comprobar que se ha borrado verificando que no aparece al recuperarlos de nuevo
		books = bookRepository.findAll();
		System.out.println(books);



		System.out.println("==================== FIND BY ID BOOK ====================");
		// Buscar libro por id:
//		Book book = bookRepository.findById(1L);
//		if(book != null)
//			System.out.println(book.getTitle());
		// Optional: permite evitar tener que trabajar con null directamente
		// Optional: indica que un valor puede estar o puede no estar
		Optional<Book> bookOptional = bookRepository.findById(1L);

		if (bookOptional.isPresent()) {
			Book book = bookOptional.get();
			System.out.println(book.getTitle());

		} else {
			System.out.println("No existe el libro");
		}





		// CRUD EMPLOYEES

		EmployeeRepository employeeRepo = spring.getBean(EmployeeRepository.class);
		System.out.println("==================== SAVE EMPLOYEES ====================");

		Employee emp1 = new Employee(null, "employee1", "1111A");
		Employee emp2 = new Employee(null, "employee2", "2222A");
		employeeRepo.save(emp1);
		employeeRepo.save(emp2);

		System.out.println("==================== FIND ALL EMPLOYEES ====================");
		List<Employee> employees = employeeRepo.findAll();
		System.out.println(employees);

		System.out.println("==================== DELETE BY ID EMPLOYEE ====================");
		employeeRepo.deleteById(1L);
		System.out.println(employeeRepo.findAll());


		// CRUD AUTHOR - ADDRESS - ASOCIACIÓN ONE TO ONE


		AddressRepository addressRepo = spring.getBean(AddressRepository.class);
		Address address1 = new Address(null, "street1", "madrid", "spain");
		Address address2 = new Address(null, "street2", "madrid", "spain");
		addressRepo.save(address1);
		addressRepo.save(address2);


		AuthorRepository authorRepo = spring.getBean(AuthorRepository.class);
		// cada author tiene un address distinto, no se pueden repetir
		Author author1 = new Author(null, "author1", "111A", "a1@email.com", LocalDate.now(), true, 3000.0, address1);
		Author author2 = new Author(null, "author2", "222A", "a2@email.com", LocalDate.now(), true, 3000.0, address2);
		authorRepo.save(author1);
		authorRepo.save(author2);




	}

}
