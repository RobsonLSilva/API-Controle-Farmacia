package com.remedios.robson.curso.controller;

import com.remedios.robson.curso.dto.mapped.ProductMapped;
import com.remedios.robson.curso.dto.response.ProductDTOResponse;
import com.remedios.robson.curso.entities.Product;
import com.remedios.robson.curso.dto.request.ProductDTORequest;
import com.remedios.robson.curso.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/remedios")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public ResponseEntity<ProductDTOResponse> cadastrar(@RequestBody ProductDTORequest request){
        Product product = ProductMapped.toProduct(request);
        ProductDTOResponse response = ProductMapped.toProductDTOResponse(service.insert(product));

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}") // Tipo de requisição com parâmetro passado pelo end point "localhost:8080/remedios/id"
    public ResponseEntity<ProductDTOResponse> buscarPorId(@PathVariable Long id){ // A anotação @PathVariable permite pegar o parâmetro passado no End Point
        ProductDTOResponse response = ProductMapped.toProductDTOResponse(service.findById(id));
        return ResponseEntity.ok().body(response);
    }
}
