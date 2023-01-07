package com.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.Json.Json;
import com.Service.EmployeeService;
import com.model.Employee;


@org.springframework.stereotype.Controller("con")
public class Controller {
public static	Logger log= LoggerFactory.getLogger(Controller.class);
	
	
	@Autowired
	EmployeeService employeeService;
	@Autowired
	Json jj;
	
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

public void GsonList(List<Employee> list, String location) {
	
	jj.GsonList(list, location);
}
public void  gSon(Employee emp, String location) {
	
	jj.gSon(emp, location);
}
}
