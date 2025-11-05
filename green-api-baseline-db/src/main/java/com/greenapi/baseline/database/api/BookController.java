package com.greenapi.baseline.database.api;

import com.greenapi.baseline.database.domain.Book;
import com.greenapi.baseline.database.repo.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cache.annotation.Cacheable;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/books")
public class BookController {
    private final BookRepository repo;
    public BookController(BookRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Book> all() { return repo.findAll().stream().toList(); }

    @Cacheable("books")
    @GetMapping("/cacheable")
    public List<Book> allWithCache() { return repo.findAll().stream().toList(); }


}