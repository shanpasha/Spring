package com.DAO;


import java.util.List;

import com.model.Employee;

public interface EmployeeDao {
	
	void save(Employee employee);
	void updateByID(Employee employee);

	List<Employee> getAll();
	Employee getByid(Integer integer);
	

}
