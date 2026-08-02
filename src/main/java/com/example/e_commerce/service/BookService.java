package com.example.e_commerce.service;

import com.example.e_commerce.dto.CreateBookRequest;
import com.example.e_commerce.dto.UpdateBookRequest;
import com.example.e_commerce.entity.Book;
import com.example.e_commerce.entity.enums.BookStatus;
import com.example.e_commerce.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public Book getById(UUID id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book create(CreateBookRequest request) {
        return bookRepository.save(new Book(
                    request.getTitle(),
                    request.getIsbn(),
                    request.getDescription(),
                    request.getPublicationDate(),
                    request.getPages(),
                    request.getPrice(),
                    request.getStockQuantity()
                ));
    }

    public Book update(UpdateBookRequest request) {
        Book book = getById(request.getId());
        if (book != null) {
            book.setTitle(request.getTitle());
            book.setIsbn(request.getIsbn());
            book.setDescription(request.getDescription());
            book.setPublicationDate(request.getPublicationDate());
            book.setPages(request.getPages());
            book.setPrice(request.getPrice());
            book.setStockQuantity(request.getStockQuantity());
            book.setUpdatedAt(LocalDateTime.now());
            return bookRepository.save(book);
        }
        return null;
    }

    public Book deactivate(UUID id) {
        Book book = getById(id);
        if (book != null) {
            book.setStatus(BookStatus.INACTIVE);
            book.setUpdatedAt(LocalDateTime.now());
            return bookRepository.save(book);
        }
        return null;
    }

    public List<Book> search(String title) {
        return bookRepository.findByTitleContainingIgnoreCase(title.trim());
    }
}
