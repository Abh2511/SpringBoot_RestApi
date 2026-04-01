package com.abhirat.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhirat.binding.Customer;

@RestController
public class CustomerRestController {
	
	@DeleteMapping("/customer")
	public ResponseEntity<String> updateCustomer(@RequestBody Customer c)
	{
		
		return new ResponseEntity<>("Customer Updated" , HttpStatus.OK);
	}
	
	
	@DeleteMapping("/customer/{cid}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("cid") Integer cid)
	{
		return new ResponseEntity<>("Customer Deleted" ,HttpStatus.OK);
	}
	
	@PostMapping("/customer")
	public ResponseEntity<String> createCustomer(Customer c)
	{
		System.out.println(c);
		
		return new ResponseEntity<>("Product Saved" ,HttpStatus.CREATED); 
	}

	@GetMapping(value = "/customers" , produces = "application/json")
	public ResponseEntity<List<Customer>> getCustomers()
	{
		Customer c = new Customer(1,"John","John@gmail.com");
		Customer c2 = new Customer(2,"Abhirat","abhi@gmail.com");
		Customer c3 = new Customer(3,"Stev","stev@gmail.com");
		
	    List<Customer> list = Arrays.asList(c,c2,c3);
		 
	    return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@GetMapping(value = "/customer" , produces = "application/json")
	public ResponseEntity<Customer> getCustomer()
	{
		Customer c = new Customer(1,"John","John@gmail.com");
		return new ResponseEntity< >(c,HttpStatus.OK); 
	}
	
}
