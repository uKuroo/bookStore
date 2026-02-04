package br.com.bookstore.app.dtos;

import br.com.bookstore.app.models.entities.Book;

public record BookDto(
    Long id,
    String name
) {
    public BookDto(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public static BookDto fromEntity(Book book){
        return new BookDto(
            book.getId(),
            book.getName()
        );
    }
}
