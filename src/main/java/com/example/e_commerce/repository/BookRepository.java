package com.example.e_commerce.repository;

import com.example.e_commerce.entity.Book;
import com.example.e_commerce.entity.enums.BookStatus;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BookRepository extends JpaRepository<Book, UUID> {
    @Query("""
            SELECT b FROM Book b
            WHERE
                (:title IS NULL OR LOWER(b.title) LIKE LOWER(CONCAT('%', CAST(:title AS string), '%'))) AND
                (:status IS NULL OR b.status = :status) AND
                (:minPrice IS NULL OR b.price >= :minPrice) AND
                (:maxPrice IS NULL OR b.price <= :maxPrice)
            """)
    Page<Book> filter(
        Pageable pageable,
        @Param("title") String title,
        @Param("status") BookStatus status,
        @Param("minPrice") Double minPrice,
        @Param("maxPrice") Double maxPrice
    );
}
