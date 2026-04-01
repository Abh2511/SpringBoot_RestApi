package com.abhirat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.registry.ImportHttpServices.Container;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/Rto")
	public String GetMsg()
	{
		return "Hello Abhirat Bawane";
	}
	

	
	
}
