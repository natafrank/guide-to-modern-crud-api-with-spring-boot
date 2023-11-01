package com.natafrank.moderncrudapi.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

    @GetMapping
    public String getProducts(){
        return "getProducts";
    }

    @PostMapping
    public String insertProduct(){
        return "insertProduct";
    }

    @PutMapping
    public String updateProduct(){
        return "updateProduct";
    }

    @DeleteMapping
    public String deleteProduct(){
        return "deleteProduct";
    }
}