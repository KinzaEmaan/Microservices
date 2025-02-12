package com.example.microservices.bookservice.dto; // ✅ New package

public class GenreDTO {
    private String bookName;
    private String quote;

    public GenreDTO() {}

    public GenreDTO(String bookName, String quote) {
        this.bookName = bookName;
        this.quote = quote;
    }

    public String getBookName() { return bookName; }
    public String getQuote() { return quote; }

    public void setBookName(String bookName) { this.bookName = bookName; }
    public void setQuote(String quote) { this.quote = quote; }
}
