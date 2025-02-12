package com.example.microservices.genreservice.services;

import com.example.microservices.genreservice.model.Genre;
import com.example.microservices.genreservice.repository.GenreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {
    private final GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    public List<Genre> getQuotesByBookName(String bookName) {
        return genreRepository.findByBookName(bookName);
    }
    public Genre addQuote(Genre genre) {
        return genreRepository.save(genre);
    }
}
