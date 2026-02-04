package br.com.bookstore.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.bookstore.app.dtos.BookDto;
import br.com.bookstore.app.dtos.BookFormDto;
import br.com.bookstore.app.models.entities.Book;
import br.com.bookstore.app.repositories.BookRepository;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public BookDto save(BookFormDto dto){
        return BookDto.fromEntity(bookRepository.save(new Book(dto)));
    }

}
