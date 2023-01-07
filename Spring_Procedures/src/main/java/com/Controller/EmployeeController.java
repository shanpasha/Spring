package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import com.bean.Employee;
import com.service.EmployeeServiceImpl;


@Controller("employeeController")
public  class  EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;

	public void save(Employee employee) {

		System.out.println("Employee controller save method");

		employeeServiceImpl.save(employee);
		
	}

	public void updateByID(Employee employee) {

		System.out.println("Employee controller save method");

		employeeServiceImpl.updateByID(employee);
		
	}
	
	
	public List<Employee> FindAll(){
		
		return employeeServiceImpl.FindAll();
	}
	
	public Employee FindByID(Integer id){
		return employeeServiceImpl.FindByID(id);
		
	}
}
