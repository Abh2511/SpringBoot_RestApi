package com.abhirat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhirat.service.ProductService;

import reactor.core.publisher.Mono;

@RestController
public class ProductRestController 
{
	@Autowired
	private ProductService service;
	
	
	@GetMapping("/product")   
	public ResponseEntity<Mono<String>> getProduct()
	{
	    Mono<String> product = service.getProduct("1");
		
		return new ResponseEntity<>(product,HttpStatus.OK);
		
	}
	
	
}
