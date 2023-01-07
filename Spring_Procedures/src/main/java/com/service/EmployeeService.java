package com.service;

import java.util.List;

import com.bean.Employee;

public interface EmployeeService {

	void save(Employee employee);
	void updateByID(Employee employee);
	public List<Employee> FindAll();
	public Employee FindByID(Integer id);
		
	
}
