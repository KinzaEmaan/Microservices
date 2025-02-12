package com.example.microservices.bookservice.controllers;

import com.example.microservices.bookservice.model.Book;
import com.example.microservices.bookservice.service.BookService;
import com.example.microservices.bookservice.feign.BookClient;
import com.example.microservices.bookservice.dto.GenreDTO; // ✅ Use DTO

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;
    private final BookClient bookClient;

    public BookController(BookService bookService, BookClient bookClient) {
        this.bookService = bookService;
        this.bookClient = bookClient;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    // ✅ Fetch quotes for a specific book (calls `genreservice` via Feign Client)
    @GetMapping("/{bookName}/quotes")
    public List<GenreDTO> getQuotesByBookName(@PathVariable String bookName) {
        return bookClient.getQuotesByBookName(bookName);
    }
}
