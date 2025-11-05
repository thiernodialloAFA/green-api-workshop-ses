package com.example.optimized.api;

import com.example.optimized.domain.Book;
import com.example.optimized.service.BookService;
import com.example.optimized.repo.BookReactiveRepository;
import com.example.optimized.service.BookServiceReactif;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.r2dbc.core.DatabaseClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@RestController
@RequestMapping("/reactive/books")
@Slf4j
public class BookReactiveController {
    private final BookServiceReactif bookService;
    private final BookReactiveRepository repo;

    public BookReactiveController(BookServiceReactif bookService, BookReactiveRepository repo) {
        this.bookService = bookService;
        this.repo = repo;
    }
}
