package com.loki.orderservice.model;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestModel 
{
	  private long poductId;
	  private long quantity;
	  private long totalAmount;
	  private Payement paymentMode;
	  

}
