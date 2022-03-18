package com.employee.service;

import java.util.List;

import com.employee.DTO.EmployeeDTO;
import com.employee.repositoryDAO.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService{
	EmployeeRepositoryImpl employeeDAO = new EmployeeRepositoryImpl();
	
	@Override
	public void insert(EmployeeDTO emp) {
		employeeDAO.insertEmployee(emp);
	}
	
	@Override
	public void delete(int empID) {
		employeeDAO.removeEmployee(empID);
	}

	public List<EmployeeDTO> getAllEmployees(){
		return employeeDAO.fetchEmployee();
	}
}
