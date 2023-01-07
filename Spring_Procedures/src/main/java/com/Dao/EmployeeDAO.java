package com.Dao;

import java.util.List;
import java.util.Map;

import com.bean.Employee;

public interface EmployeeDAO {

	void save(Employee employee);
	void updateByID(Employee employee);
	 List<Employee> FindAll();
	Employee FindByID(Integer id);
	 public Map<String, Integer> Callpro(int num1,int num2);

}
