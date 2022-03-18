package com.employee.repositoryDAO;

import com.employee.DTO.EmployeeDTO;

public interface EmployeeRepository {

	void insertEmployee(EmployeeDTO emp);

	void removeEmployee(int empID);

}
