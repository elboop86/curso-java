package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

// Proporciona Métodos CRUD: Create, Retrieve/Read, Update, Delete

public interface BookRepository extends JpaRepository<Book, Long> {
}
