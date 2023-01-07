package com.Controller;

import com.bean.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class EmployeeController {
	EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	public void save(Employee employee) {

		System.out.println("Employee controller save method");

		employeeService.save(employee);
	}

}
