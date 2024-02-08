package com.remedios.robson.curso.services;

import com.remedios.robson.curso.entities.Product;
import com.remedios.robson.curso.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product insert(Product product){
        return repository.save(product); // Criar tratamento de excessões
    }

    public Optional<Product> findById(Long id){
        return repository.findById(id); // Criar tratamento de excessões
    }
}
