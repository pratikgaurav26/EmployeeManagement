package com.employee.DTO;

public class EmployeeDTO {
	private int empID;
	private String empName;
	private String department;
	
	
	
	public EmployeeDTO() {
		
	}
	public EmployeeDTO(int empID, String empName, String department) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.department = department;
	}
	public int getEmpID() {
		return empID;
	}	
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	
	public String toString() {
		return "EmployeeDTO [empID=" + empID + ", empName=" + empName + ", department=" + department + "]";
	}
	
	

}
