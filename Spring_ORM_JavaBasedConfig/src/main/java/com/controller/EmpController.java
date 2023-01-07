package com.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Service.EmployeeService;
import com.model.Employee;


@Controller("con")
public class EmpController {
public static	Logger log= LoggerFactory.getLogger(Controller.class);
	
	
	@Autowired
	EmployeeService employeeService;
	

	
	public void save(Employee employee) {
		
		employeeService.save(employee);
	}
	
	public void updateByID(Employee employee) {
		employeeService.updateByID(employee);
		
	}
	
public Employee getByid(Integer integer) {
	log.info("method started "); 
	Employee em=employeeService.getByid(integer);
	log.info("method started ",em); 
		return  em;
		
	}

public List<Employee> getAll() {
	
	return employeeService.getAll();
}

}
