package com.example.microservices.genreservice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "genres")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String quote;
    private String bookName;

    public Genre() {}

    public Genre(String quote, String bookName) {
        this.quote = quote;
        this.bookName = bookName;
    }

    public int getId() { return id; }
    public String getQuote() { return quote; }
    public String getBookName() { return bookName; }

    public void setQuote(String quote) { this.quote = quote; }
    public void setBookName(String bookName) { this.bookName = bookName; }
}
