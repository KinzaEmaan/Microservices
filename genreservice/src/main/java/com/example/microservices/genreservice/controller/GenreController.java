package com.example.microservices.genreservice.controller;

import com.example.microservices.genreservice.model.Genre;
import com.example.microservices.genreservice.services.GenreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genre")
public class GenreController {
    private final GenreService genreService;

    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping
    public List<Genre> getAllGenres() {
        return genreService.getAllGenres();
    }

    // ✅ FIXED: Use @RequestParam instead of @PathVariable
    @GetMapping("/quotes")
    public List<Genre> getQuotesByBookName(@RequestParam String bookName) {
        return genreService.getQuotesByBookName(bookName);
    }

    @PostMapping
    public Genre addQuote(@RequestBody Genre genre) {
        return genreService.addQuote(genre);
    }
}
