package com.loki.Employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loki.Employee.model.RequestEntity;
import com.loki.Employee.model.Responce;



@RestController
@RequestMapping("/employee")
public class EmployeeControler 
{
	@Autowired
	private EmployeeService employeeService;
	
   
   
   @PostMapping("/save")
   public ResponseEntity<Long>saveData(@RequestBody RequestEntity requestEntity)
	{
		long employeID= employeeService.saveData(requestEntity);
		
		return new ResponseEntity<>(employeID , HttpStatus.CREATED);
		
	}
   
   @GetMapping("get/{id}")
   public ResponseEntity<Responce>getDataByID(@PathVariable("id") Long id)
   {
	   Responce responce = employeeService.getDataByID(id);
	   
	return new ResponseEntity<>(responce, HttpStatus.OK);
	   
   }
   
}
