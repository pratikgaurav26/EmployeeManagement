package com.employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.employee.DTO.EmployeeDTO;
import com.employee.service.EmployeeServiceImpl;
import com.employee.util.SpringConfiguration;

public class EmployeemanagementApplication {

	public static void main(String[] args) {
		EmployeeDTO service = null;

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		service = (EmployeeDTO)context.getBean("employeeDTO");
		System.out.println(service.getEmpID());
		System.out.println(service.getEmpName());
		System.out.println(service.getDepartment());
		
		context.close();
		
	}

}
