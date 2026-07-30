package com.example.e_commerce.dto;

import java.time.LocalDate;
import java.util.UUID;

public class UpdateBookRequest {
    private UUID id;
    private String title;
    private String isbn;
    private String description;
    private LocalDate publicationDate;
    private Integer pages;
    private Double price;
    private Integer stockQuantity;

    public UpdateBookRequest() {
    }

    public UpdateBookRequest(UUID id, String title, String isbn, String description, LocalDate publicationDate, Integer pages, Double price, Integer stockQuantity) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.description = description;
        this.publicationDate = publicationDate;
        this.pages = pages;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public Integer getPages() {
        return pages;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
