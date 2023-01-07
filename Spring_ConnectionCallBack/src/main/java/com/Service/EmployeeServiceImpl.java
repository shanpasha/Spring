package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.EmployeeDao;
import com.bean.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
EmployeeDao employeeDao;
	
	public Employee FindById(Integer id) {
		
		return employeeDao.FindById(id);
	}

	public List<Employee> getAllEmps() {
		
		return employeeDao.getAllEmps();
	}

}
