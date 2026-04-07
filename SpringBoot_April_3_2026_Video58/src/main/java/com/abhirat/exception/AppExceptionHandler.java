package com.abhirat.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler 
{

	@ExceptionHandler(value=ProductNotFoundException.class)
	public ResponseEntity<ExInfo> handlePNDE(ProductNotFoundException pe){
		
		ExInfo ob = new ExInfo();
		ob.setExCode("SBIOOO2");
		ob.setExMsg(pe.getMessage());
		ob.setExDate(LocalDate.now());
		
		return new ResponseEntity<>(ob,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ExInfo> handleException(Exception e)
	{
		ExInfo ob1 = new ExInfo();
		ob1.setExCode("SBIOOO1");
		ob1.setExMsg(e.getMessage());
		ob1.setExDate(LocalDate.now());
		
		return new ResponseEntity<>(ob1,HttpStatus.INTERNAL_SERVER_ERROR);
	}


}
