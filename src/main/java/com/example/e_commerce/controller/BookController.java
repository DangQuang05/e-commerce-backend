package com.example.e_commerce.controller;

import com.example.e_commerce.dto.CreateBookRequest;
import com.example.e_commerce.dto.UpdateBookRequest;
import com.example.e_commerce.entity.Book;
import com.example.e_commerce.entity.enums.BookStatus;
import com.example.e_commerce.service.BookService;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "http://localhost:5173/")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<Page<Book>> getList(
        @RequestParam(name = "page", required = false, defaultValue = "0") int page,
        @RequestParam(name = "title", required = false, defaultValue = "") String title,
        @RequestParam(name = "status", required = false) BookStatus status) {
        return ResponseEntity.ok(bookService.getList(page, title, status));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getById(@PathVariable("id") UUID id) {
        return ResponseEntity.ok(bookService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Book> create(@RequestBody CreateBookRequest request) {
        return ResponseEntity.ok(bookService.create(request));
    }

    @PutMapping
    public ResponseEntity<Book> update(@RequestBody UpdateBookRequest request) {
        return ResponseEntity.ok(bookService.update(request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Book> deactivate(@PathVariable("id") UUID id) {
        return ResponseEntity.ok(bookService.deactivate(id));
    }
}
