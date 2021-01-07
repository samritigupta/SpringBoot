package com.springboot.example.demo.service;

import com.springboot.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
