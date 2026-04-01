package com.abhirat.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Web {
	
	@PostMapping("/users")
	public String createUSer()
	{
		return "User Received ";
	}
	

}
