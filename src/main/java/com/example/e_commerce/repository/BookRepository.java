package com.example.e_commerce.repository;

import com.example.e_commerce.entity.Book;
import com.example.e_commerce.entity.enums.BookStatus;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BookRepository extends JpaRepository<Book, UUID> {
    Page<Book> findByTitleContainingIgnoreCase(Pageable pageable, String title);
    Page<Book> findByTitleContainingIgnoreCaseAndStatus(Pageable pageable, String title, BookStatus status);
}
