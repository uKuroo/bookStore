package br.com.bookstore.app.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bookstore.app.dtos.BookDto;
import br.com.bookstore.app.dtos.BookFormDto;
import br.com.bookstore.app.models.entities.Book;
import br.com.bookstore.app.services.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping
    @Operation(summary = "Retorna todos os livros")
    @ApiResponse(responseCode = "200")
    public ResponseEntity<List<Book>> getAll(){
        return ResponseEntity.ok(bookService.findAll());
    }
    
    @PostMapping
    @Operation(summary = "Salva um livro")
    @ApiResponse(responseCode = "201")
    public ResponseEntity<BookDto> postBook(@RequestBody BookFormDto dto){
        return ResponseEntity.ok(bookService.save(dto));
    }
}
