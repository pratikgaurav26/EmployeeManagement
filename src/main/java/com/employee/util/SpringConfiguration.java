package com.employee.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.employee.DTO.EmployeeDTO;
import com.employee.repositoryDAO.EmployeeRepository;
import com.employee.repositoryDAO.EmployeeRepositoryImpl;


@Configuration
public class SpringConfiguration {

	  @Bean 
	  public EmployeeRepository employeeDAO() { 
	  return new EmployeeRepositoryImpl();
	  
	  }
	 
	@Bean 
	public EmployeeDTO employeeDTO() {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmpID(1);
		employeeDTO.setEmpName("Pratik");
		employeeDTO.setDepartment("DEV");
		return employeeDTO;
	}
}
