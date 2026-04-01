package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@GetMapping(value="/msg" , produces = "text/plain ")
	public ResponseEntity<String> getMsg()
	{
		
		String msg = "Welcome to Wardha District";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/greet/{name}")
	public String getGreetMsg(@PathVariable("name") String name)
	{
		String msg = "Good Morning .. !!";
		return msg;
	}
	
	@GetMapping("/welcome")
	public String hello(@RequestParam("name") String name)
	{
		
		String msg = name+",Welcome To the world of the REST API";
		return msg;
	}
	

}
