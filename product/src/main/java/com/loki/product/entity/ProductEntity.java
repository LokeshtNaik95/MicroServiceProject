package com.loki.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductEntity
{

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long productID;
	
	private String productName;
	
	private long productPrice ;
	
	private long productQuantity;
}
