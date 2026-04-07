package com.abhirat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhirat.service.ProductService;

import reactor.core.publisher.Mono;

@RestController
public class ProductRestController
{
	private final ProductService service;

    public ProductRestController(ProductService service)
    {
        this.service = service;
    }

    @GetMapping("/product")
    public Mono<ResponseEntity<String>> getProductNew()
    {
        return service.getProduct()
                .map(product -> new ResponseEntity<>(product, HttpStatus.OK));
    }


}
