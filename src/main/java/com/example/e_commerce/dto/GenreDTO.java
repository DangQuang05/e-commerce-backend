package com.example.e_commerce.dto;

import java.util.UUID;

public class GenreDTO {
    private UUID id;
    private String name;

    public GenreDTO() {
    }

    public GenreDTO(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
