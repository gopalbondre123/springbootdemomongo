package com.gopalsoft.service;

import java.util.List;

import com.gopalsoft.entity.Employee;

public interface EmployeeService {

	List<Employee> getEmployees();
	
	Employee getOneEmployee(String empId);
	
	String saveEmployee(Employee e);//insert new
	
    void updateOneEmployee(Employee e);
	
	void deleteOneEmployee(String empId);

}
