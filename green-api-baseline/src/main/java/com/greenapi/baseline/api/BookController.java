package com.greenapi.baseline.api;

import com.greenapi.baseline.domain.Book;
import com.greenapi.baseline.repo.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookRepository repo;
    public BookController(BookRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Book> all() { return repo.findAll(); }

}
