package br.com.bookstore.app.models.entities;

import br.com.bookstore.app.dtos.BookFormDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", nullable=false, length=50)
    private String name;

    public Book(){}

    public Book(BookFormDto dto){
        this.name = dto.name();
    }

    public Long getId(){
        return this.id;
    }

    public String getName() {
        return this.name;
    }

}
