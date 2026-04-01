package com.example.demo.rest;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
	
	public ResponseEntity<Customer> getCustomer()
	{
		 Customer = new Customer (1, "John" ,"john@gmail.com");
		
	}

}
