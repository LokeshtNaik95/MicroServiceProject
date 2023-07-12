package com.loki.product.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loki.product.model.ProdectResponce;
import com.loki.product.model.ProductRequest;
import com.loki.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductControler 
{
	@Autowired
	private ProductService productService;
	
	@PostMapping("/save")
	public ResponseEntity<Long>addProduct(@RequestBody ProductRequest productRequest)
	{
		long productID= productService.adProduct(productRequest);
		
		return new ResponseEntity<>(productID , HttpStatus.CREATED);
		
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<ProdectResponce> getProductById(@PathVariable("id") long id)
	{
		ProdectResponce prodectResponce=
				productService.getProductById(id);
				
		return new ResponseEntity<>(prodectResponce, HttpStatus.OK);
		
	}

}
