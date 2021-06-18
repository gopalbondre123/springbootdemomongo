package com.gopalsoft.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gopalsoft.entity.Employee;
import com.gopalsoft.repository.EmployeeRepository;

@Service
@Transactional
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
		String empId=employeeRepository.insert(e).getId();
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

	@Override
	public void updateOneEmployee(Employee emp) {
		employeeRepository.save(emp);//insert or update
		
	}

}
