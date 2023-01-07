package com.service;

import com.Dao.EmployeeDAO;
import com.Dao.EmployeeDaoImpl;
import com.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDAO employeeDao;
	 
	
	public void setEmployeeDao(EmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void save(Employee employee){
	System.out.println("EmployeeService method is called");
	employeeDao.save(employee);
		
	}

}
