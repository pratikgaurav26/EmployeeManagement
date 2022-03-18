package com.employee.repositoryDAO;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.employee.DTO.EmployeeDTO;

public class EmployeeRepositoryImpl implements EmployeeRepository{
	List<EmployeeDTO> employee = null;
	
	@PostConstruct
	public void initializer() {
		EmployeeDTO employeeDto = new EmployeeDTO();
		employeeDto.setEmpID(1);
		employeeDto.setEmpName("Pratik Gaurav");
		employeeDto.setDepartment("DEV");
		employee = new ArrayList<>();
		employee.add(employeeDto);
	}
	@Override
	public void insertEmployee(EmployeeDTO emp) {
		employee.add(emp);
	}
	
	@Override
	public void removeEmployee(int empID) {
		employee.remove(empID);
		
	}

	public List<EmployeeDTO> fetchEmployee(){
		return employee;
		
	}

}
