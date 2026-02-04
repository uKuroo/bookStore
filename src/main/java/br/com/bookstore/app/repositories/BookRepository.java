package br.com.bookstore.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bookstore.app.models.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
    
}
