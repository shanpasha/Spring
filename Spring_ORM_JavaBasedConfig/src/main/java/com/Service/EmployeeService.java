package com.Service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {
	void save(Employee employee);

	void updateByID(Employee employee);
	Employee getByid(Integer integer);
	List<Employee> getAll();
}
