package com.example.e_commerce.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.e_commerce.entity.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, UUID> {
    
}
