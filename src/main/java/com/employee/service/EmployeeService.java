package com.employee.service;

import com.employee.DTO.EmployeeDTO;

public interface EmployeeService {

	void insert(EmployeeDTO emp);

	void delete(int empID);

}
