package com.monteirodev.java.crud.controller;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping
    public ResponseEntity getAllProducts() {
        return ResponseEntity.ok("Its ok!");
    }

}
