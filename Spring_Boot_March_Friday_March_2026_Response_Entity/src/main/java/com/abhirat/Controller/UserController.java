package com.abhirat.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/users")
public class UserController 
{
//	@GetMapping("/user/{id}")
//	public ResponseEntity<String> getUserById(@PathVariable int id)
//	{
//		return ResponseEntity.ok("User Id = " +id);
//	}
	
	@GetMapping("/{id}")
	public ResponseEntity<String> getUser(@PathVariable int id) {

	    if (id == 101) {
	        // 200 OK
	        return ResponseEntity.ok("User सापडला!");
	    } else {
	        // 404 Not Found
	        return ResponseEntity.notFound().build();
	    }
	}



}
