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

		return employeeRepository.save(employee);
	}

	public Employee getEmployee(long id) {

		return employeeRepository.findById(id).get();

	}

	public List<Employee> getAllEmployee() {

		return employeeRepository.findAll();
	}

	public void deleteEmployee(long id) {
		employeeRepository.deleteById(id);
		
	}

	public Employee updateEmpplyee(Employee employee) {
		// TODO Auto-generated method stub
		
		Employee update = employeeRepository.save(employee);
		return update;
	}

}
