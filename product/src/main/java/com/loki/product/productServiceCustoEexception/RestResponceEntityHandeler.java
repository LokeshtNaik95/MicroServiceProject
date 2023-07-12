package com.loki.product.productServiceCustoEexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.loki.product.model.ErrorStatus;


@ControllerAdvice
public class RestResponceEntityHandeler extends ResponseEntityExceptionHandler
{
  // here we can handle the exception 
	
	@ExceptionHandler(ProductException.class)
	public ResponseEntity<ErrorStatus> handelProductServiceException(ProductException exception)
	{
		return new ResponseEntity<>(new ErrorStatus().builder().errorCode(exception.getErrorCode())
				.errorMessage(exception.getMessage()).build(),HttpStatus.NOT_FOUND
				
				);
		
	}
}
