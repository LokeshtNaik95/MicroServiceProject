package com.loki.orderservice.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loki.orderservice.model.RequestModel;
import com.loki.orderservice.service.OrderService;



@RestController
@RequestMapping("/order")
public class OrderControler 
{

	@Autowired
	private OrderService orderService;
	
	@PostMapping("/placeOrder")
	public ResponseEntity<Long>placeOrder(@RequestBody RequestModel requestModel)
	{
		
		long orderId = orderService.placeOrder(requestModel);
		return new  ResponseEntity<>(orderId,HttpStatus.CREATED);
		
	}
}
