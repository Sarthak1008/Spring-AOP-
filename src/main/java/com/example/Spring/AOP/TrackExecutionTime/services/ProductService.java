package com.example.Spring.AOP.TrackExecutionTime.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Spring.AOP.TrackExecutionTime.advice.TrackExecutionTime;
import com.example.Spring.AOP.TrackExecutionTime.entities.Product;
import com.example.Spring.AOP.TrackExecutionTime.repositories.ProductRepository;

import jakarta.annotation.PostConstruct;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    /*
     * The PostConstruct annotation is used on a method that needs to be executed
     * after dependency injection is done to perform any initialization. This method
     * must be invoked before the class is put into service. This annotation must be
     * supported on all classes that support dependency injection. The method
     * annotated with PostConstruct must be invoked even if the class does not
     * request any resources to be injected. Only one method in a given class can be
     * annotated with this annotation. The method on which the PostConstruct
     * annotation is applied must fulfill all of the following criteria:
     * 
     * The method must not have any parameters except in the case of interceptors in
     * which case it takes an InvocationContext object as defined by the Jakarta
     * Interceptors specification.
     */

    @PostConstruct
    public void initDB() {
        List<Product> list = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            list.add(new Product(i, "product" + i, new Random().nextInt(2000)));
        }
        repository.saveAll(list);
    }

    @TrackExecutionTime
    public List<Product> addProduct(List<Product> products) {
        return repository.saveAll(products);
    }

    @TrackExecutionTime
    public List<Product> findAllProducts() {
        return repository.findAll();
    }

}