package com.Dao;

import java.util.List;

import com.bean.Employee;

public interface EmployeeDAO {

	void save(Employee employee);
	void updateByID(Employee employee);
	 List<Employee> FindAll();
	Employee FindByID(Integer id);
	

}
