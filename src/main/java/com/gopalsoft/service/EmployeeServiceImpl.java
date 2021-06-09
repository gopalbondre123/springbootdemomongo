package com.gopalsoft.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gopalsoft.entity.Employee;
import com.gopalsoft.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository  employeeRepository;

	@Override
	public List<Employee> getEmployees() {
		
		return employeeRepository.findAll();
	}
	
	@Override
	public String saveEmployee(Employee e) {
		System.out.println(e);		
		String empId=employeeRepository.save(e).getId();
		return empId;
	}



	@Override
	public Employee getOneEmployee(String empId) {
	Employee emp=employeeRepository.findById(empId).get();
	return emp;
	
	}

	

	@Override
	public void deleteOneEmployee(String empId) {
		Employee emp=getOneEmployee(empId);
		employeeRepository.delete(emp);
	}

}
