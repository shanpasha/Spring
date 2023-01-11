package com.Service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {
	
	void save (Employee employee);
	List<Employee>findAll();
	Employee getByID(Integer id) ;
		
	public void update(Employee employee);
	public void deleteById(Integer id) ;


}
