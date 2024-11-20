package org.example.order;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    private String isbn;

    private String title;
    private String description;
    private String author;

    public Book() {}

    public Book(String isbn, String title, String description, String author) {
        this.isbn = isbn;
        this.title = title;
        this.description = description;
        this.author = author;
    }
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
}
