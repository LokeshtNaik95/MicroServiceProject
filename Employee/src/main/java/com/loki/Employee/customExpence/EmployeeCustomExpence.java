package com.loki.Employee.customExpence;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeCustomExpence extends RuntimeException
{
   
	private String errorCode;
	
	public EmployeeCustomExpence(String errorCode, String errormsg)
	{
		super(errormsg);
		this.errorCode=errorCode;
	}
}
