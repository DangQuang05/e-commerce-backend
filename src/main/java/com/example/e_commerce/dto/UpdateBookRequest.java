package com.example.e_commerce.dto;

import java.util.UUID;

public class UpdateBookRequest {
    private UUID id;
    private String title;
    private String description;
    private Double price;
    private Integer stockQuantity;

    public UpdateBookRequest() {
    }

    public UpdateBookRequest(UUID id, String title, String description, Double price, Integer stockQuantity) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
