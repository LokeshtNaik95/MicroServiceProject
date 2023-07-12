package com.loki.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdectResponce
{
	
	// get method giving response to the client
	
    private long productID;
	
	private String productName;
	
	private long productPrice ;
	
	private long productQuantity;

}
