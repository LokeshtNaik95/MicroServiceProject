package com.loki.product.productServiceCustoEexception;

import lombok.Data;

@Data
public class ProductException extends RuntimeException
{
	
	// here we can throw this class exception but we can't handel it 
   private String errorCode;
   
   
   public ProductException(String massage, String errorCode) 
   {
	   super(massage);
	   this.errorCode=errorCode;
	   
   }
}
