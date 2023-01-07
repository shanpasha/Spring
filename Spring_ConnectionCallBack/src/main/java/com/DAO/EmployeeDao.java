package com.DAO;

import java.util.List;

import com.bean.Employee;

public interface EmployeeDao {


	Employee FindById(Integer id);
	
	List<Employee> getAllEmps();
	
	
	
}
