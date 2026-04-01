package com.abhirat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
//Path Varaible
public class UserController {

	@GetMapping("/{id}")
	public String getUser(@PathVariable int id)
	{
		return "User Id : " +id;
		
	}
	//QueryParamete
	@GetMapping("/search")
	public String getCity(@RequestParam String city)
	{
		return "City :" +city;
	}
	
	// Multiple Query Parameters
	
	@GetMapping("/searcho")
	public String getUserCityandAge(@RequestParam String city,
			                        @RequestParam int age)
	{
		return "City"+ city + "Age:" +age;
	}
	@GetMapping("/{id}/orders")
	public String getUserOrder(@PathVariable int id,
			                   @RequestParam String status)
	{
		return "User Id = " +id+ " and " +status + " orders "; 
	}
}
