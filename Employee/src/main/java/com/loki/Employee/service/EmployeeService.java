package com.loki.Employee.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loki.Employee.customExpence.EmployeeCustomExpence;
import com.loki.Employee.model.RequestEntity;
import com.loki.Employee.model.Responce;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class EmployeeService
{
	@Autowired
	private EmployeeRepository employeeRepository;

	public long saveData(RequestEntity reqvestEntity) {

		        log.info("Employee Data Is Adding");
		        EmployeeEntity employeeEntity = EmployeeEntity.builder()
		        		
				.name(reqvestEntity.getName()).dept(reqvestEntity.getDept()).build();
		        employeeRepository.save(employeeEntity);
		        log.info("Employee Data Is Completedly Created");
		return employeeEntity.getId();
		
		//employeeRepository.save(reqvestEntity);
		
	}

	public Responce getDataByID(Long id) {
		
		log.info("Get By ID is Called :{id}", id );
		
		EmployeeEntity employeeEntity = employeeRepository.findById(id).
				orElseThrow(()->new EmployeeCustomExpence("EMPLOYE Given ID is not Found ", "given id is not found"));
		
		Responce responce = new Responce();
		BeanUtils.copyProperties(employeeEntity, responce);
		
		log.info("Get By ID is Called ");
		return responce;
	}

}
