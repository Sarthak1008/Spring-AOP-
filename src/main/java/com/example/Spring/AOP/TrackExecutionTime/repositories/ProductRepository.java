package com.example.Spring.AOP.TrackExecutionTime.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring.AOP.TrackExecutionTime.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}