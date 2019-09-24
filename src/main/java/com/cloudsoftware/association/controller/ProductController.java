package com.cloudsoftware.association.controller;

import com.cloudsoftware.association.domain.Product;
import com.cloudsoftware.association.domain.ProductWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/all-product")
    public ResponseEntity<List<Product>> getAllProductList() {


        return ResponseEntity.ok(new ArrayList<Product>());

    }

    @PostMapping("/upload-product")
    public void uploadProduct(@RequestBody ProductWrapper productWrapper) {

    }







}
