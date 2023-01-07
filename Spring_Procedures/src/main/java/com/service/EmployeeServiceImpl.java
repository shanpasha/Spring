package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Dao.EmployeeDAO;
import com.Dao.EmployeeDaoImpl;
import com.Dao.EmployeeJDBCTemplateDaoImpl;

import com.bean.Employee;
import com.procedureAndFunctions.AddandMultiProcedure;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired
	@Qualifier("employeeJDBCTemplateDaoImpl")
	EmployeeDAO employeeDAO;
	 
	
    @Override
	public void save(Employee employee){
	System.out.println("EmployeeService method is called");
	employeeDAO.save(employee);
		
	}


	@Override
	public void updateByID(Employee employee) {
		employeeDAO.updateByID(employee);
		
	}


	@Override
	public List<Employee> FindAll() {
		
		return employeeDAO.FindAll();
	}


	@Override
	public Employee FindByID(Integer id) {
	
		return employeeDAO.FindByID(id);
	}
    
   

}
