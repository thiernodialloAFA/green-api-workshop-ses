package com.example.optimized.api;

import com.example.optimized.domain.Book;
import com.example.optimized.repo.BookRepository;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.CompletableFuture;

import static com.example.optimized.api.BookReactiveController.getBookResponseEntity;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookRepository repo;
    public BookController(BookRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Book> all() { return repo.findAll(); }

}
