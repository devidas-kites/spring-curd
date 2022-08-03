package com.kites.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kites.entity.Employee;
import com.kites.repository.EmployeeRepository;

@Service	
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveEmpplyee(Employee employee) {
		
		System.out.println("inside service layer ");
		
	return	employeeRepository.save(employee);
	}

	public Employee getEmployee(long id) {
		
		return employeeRepository.findById(id).get();
		// TODO Auto-generated method stub
		
	}

	public List<Employee> getAllEmployee() {

		
		return employeeRepository.findAll();
	}

}
