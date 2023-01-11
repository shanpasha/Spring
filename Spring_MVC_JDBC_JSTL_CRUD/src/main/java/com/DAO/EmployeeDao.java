package com.DAO;

import java.util.List;

import com.model.Employee;

public interface EmployeeDao {
	
	void save(Employee employee);
	List<Employee>findAll();
	Employee getById(Integer id);
	void update(Employee employee);
	void deleteById(Integer id);

}
