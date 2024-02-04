package com.remedios.robson.curso.controller;

import com.remedios.robson.curso.entities.Product;
import com.remedios.robson.curso.entities.ProductDTO;
import com.remedios.robson.curso.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/remedios")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public ResponseEntity<Product> cadastrar(@RequestBody ProductDTO dto){
        Product product = service.insert(dto.transformaParaObjeto());
        return new ResponseEntity<>(product, HttpStatus.CREATED);
        //URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(product.getId()).toUri();
        //return ResponseEntity.created(uri).body(product); // Resposta 201
    }
}
