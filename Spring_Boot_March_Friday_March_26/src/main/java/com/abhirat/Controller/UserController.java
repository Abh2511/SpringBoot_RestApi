package com.abhirat.Controller;

import java.security.PublicKey;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
//	
//	@GetMapping("/hello")
//	public String hello()
//	{
//		return "Hello Abhirat Bawane Welcome to the Pulgaon";
//	}
//	
//	@PostMapping("/welcome").
//	public String welocome()
//	{
//		return "Welcome to Dubai Lots of Love";
//	}
	
	// Query Parameter
	    @GetMapping("/search")
		public String search(@RequestParam String name,
				             @RequestParam int age)
		{
			return name + " " +age;
		}
	    
	    @GetMapping("/users/{id}")
	    public String getUser(@PathVariable int id ,
	    		              @RequestParam String name)
	    {
	    	return "Id : " +id+ " Name:" +name;
	    	
	    }
	    @GetMapping("/rcb/{id}")
	    public ResponseEntity<String> getUser(@PathVariable int id)
	    {
	    	return ResponseEntity.ok("User Id = " +id);
	    }
	

}
