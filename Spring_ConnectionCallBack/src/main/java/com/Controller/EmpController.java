package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Service.EmployeeService;
import com.bean.Employee;

@Controller
public class EmpController {
	@Autowired
	EmployeeService employeeService;
	
	
	
	public Employee FindByID(int id) {
		return employeeService.FindById(id);
		
		
	}

public	List<Employee> getAllEmps() {
		return employeeService.getAllEmps();
		
	}
}
