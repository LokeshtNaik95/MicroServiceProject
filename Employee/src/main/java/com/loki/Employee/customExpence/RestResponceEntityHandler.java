package com.loki.Employee.customExpence;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.loki.Employee.model.ErrorStatus;
@ControllerAdvice
public class RestResponceEntityHandler extends ResponseEntityExceptionHandler
{

	
	@ExceptionHandler
	public ResponseEntity<ErrorStatus>exceptionHandelRunTime( EmployeeCustomExpence exception)
	{
		return	new ResponseEntity<>(new ErrorStatus().builder().errorCode(exception.getErrorCode())
				.errorMessage(exception.getMessage()).build(),HttpStatus.NOT_FOUND);
		
		 
		
	}
}
