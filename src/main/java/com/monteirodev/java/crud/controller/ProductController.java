package com.monteirodev.java.crud.controller;

import com.monteirodev.java.crud.domain.Product;
import com.monteirodev.java.crud.domain.ProductRepository;
import com.monteirodev.java.crud.domain.RequestProduct;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository repository;


    @GetMapping
    public ResponseEntity getAllProducts() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity registerProduct(@RequestBody @Valid RequestProduct data){
        return ResponseEntity.ok(repository.save(new Product(data)));
    }
}
