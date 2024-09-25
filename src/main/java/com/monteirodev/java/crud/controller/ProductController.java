package com.monteirodev.java.crud.controller;

import com.monteirodev.java.crud.domain.Product;
import com.monteirodev.java.crud.domain.ProductRepository;
import com.monteirodev.java.crud.domain.RequestProduct;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
    public ResponseEntity registerProduct(@RequestBody @Valid RequestProduct data) {
        return ResponseEntity.ok(repository.save(new Product(data)));
    }

    @PutMapping
    public ResponseEntity updateProduct(@RequestBody @Valid RequestProduct data) {
        Optional<Product> optionalProduct = repository.findById(data.id());
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setName(data.name());
            product.setPrice_in_cents(data.price_in_cents());
            repository.save(product);
            return ResponseEntity.ok(product);
        } else {
            throw new EntityNotFoundException();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteProduct(@PathVariable long id) {
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
