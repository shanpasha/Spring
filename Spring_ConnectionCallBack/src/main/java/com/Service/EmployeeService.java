package com.Service;

import java.util.List;

import com.bean.Employee;

public interface EmployeeService  {

	Employee FindById(Integer id);
	List<Employee> getAllEmps();
}
