package com.abhirat.rest;

import java.awt.PageAttributes.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhirat.binding.Student;

@RestController
public class StudentController {
	
	@GetMapping(value = "/xgf")
	public Student getStudent()
	{ 
		return new Student(101, "Abhirat", "Java");
	}

}
