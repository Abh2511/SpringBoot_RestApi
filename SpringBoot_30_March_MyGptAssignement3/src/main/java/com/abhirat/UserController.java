package com.abhirat;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhirat.binding.User;

@RestController
public class UserController {
	
	@GetMapping(value="/user", produces = {"application/xml" , "application/json"})
	public ResponseEntity<User> getUser() 
	{
		User p = new User(1,"Abhirat","abhiratbawane00@gmail.com",23,"Bawane");
		return new ResponseEntity<>(p,HttpStatus.OK);
	}

}
