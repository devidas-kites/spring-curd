package com.kites.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kites.entity.Employee;
import com.kites.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save")
	public ResponseEntity<?> saveEmployee(@RequestBody Employee employee){
		System.out.println("Inside Contoller");
	  Employee saveEmployee	= employeeService.saveEmpplyee(employee);
		return new ResponseEntity<Employee>(saveEmployee, HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		List<Employee> allEmployee = employeeService.getAllEmployee();
		
		return new ResponseEntity<List<Employee>>(allEmployee, HttpStatus.OK);//200
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getEmployee(@PathVariable("id") long id){
		System.out.println("inside contoller get mapping by id ");
	Employee employee= employeeService.getEmployee(id);
		
		return new ResponseEntity<Employee>(employee,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("delete/{id}")
	public ResponseEntity<Void>  deleteEmployee(@PathVariable("id") long id){
		System.out.println("inside contoller get mapping by id ");
	 employeeService.deleteEmployee(id);
		
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<?> updateEmployee(@RequestBody Employee employee){
		System.out.println("Inside Contoller");
	  Employee updateEmployee	= employeeService.updateEmpplyee(employee);
		return new ResponseEntity<Employee>(updateEmployee, HttpStatus.CREATED);
	}

}
