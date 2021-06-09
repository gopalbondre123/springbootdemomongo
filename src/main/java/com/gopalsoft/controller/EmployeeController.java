package com.gopalsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gopalsoft.entity.Employee;
import com.gopalsoft.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	

	
	@PostMapping("/")
	  public ResponseEntity<String>  saveEmployee(@RequestBody Employee employee){
		  
		  
		  String empId=employeeService.saveEmployee(employee);
		  
		  return new ResponseEntity<String>("Employee ID '"+empId+"' is saved successfully",HttpStatus.OK);
		  
		  
	  }

	  
	  @GetMapping("/")
	  public ResponseEntity<List<Employee>>  getAllEmployees(){
		  System.out.println("get all employees");
		  
		  List<Employee> empList=employeeService.getEmployees();
		  System.out.println(" all employees :"+empList);
		  
		  return new  ResponseEntity<List<Employee>>(empList,HttpStatus.OK);
		  
		  
	  }
	  
	  
	  @GetMapping("/{empid}")
	  public ResponseEntity<Employee>  getOneEmployee(@PathVariable String empid){
		  
		  
		  Employee emp=employeeService.getOneEmployee(empid);
		  
		  return new  ResponseEntity<Employee>(emp,HttpStatus.OK);
		  
		  
	  }
	  
	  
	  @DeleteMapping("/{empid}")
	  public ResponseEntity<String>  deleteOneEmployee(@PathVariable String empid){
		  
		  
		  employeeService.deleteOneEmployee(empid);
		  System.out.println("Employee ID '"+empid+"' is deleted");
		  
		  
		  return new  ResponseEntity<String>("Employee ID '"+empid+"' is deleted",HttpStatus.OK);
		  
		  
	  }
	
	

}
