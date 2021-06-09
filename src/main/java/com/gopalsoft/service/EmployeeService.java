package com.gopalsoft.service;

import java.util.List;

import com.gopalsoft.entity.Employee;

public interface EmployeeService {

	List<Employee> getEmployees();
	
	String saveEmployee(Employee e);


	Employee getOneEmployee(String empId);

	
	void deleteOneEmployee(String empId);

}
