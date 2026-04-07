package com.abhirat.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class ProductService 
{
	public Mono<String> getProduct()
	{
		String apiUrl = "https://api.restful-api.dev/objects/1";
		
		WebClient webClient = WebClient.create();
		
		Mono<String> bodyMono = webClient.get() // send GET req
				                         .uri(apiUrl) //provider url
				                         .retrieve() // get response body
				                         .bodyToMono(String.class); // map response
		
		return bodyMono;
	}

}
