package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.EmployeeDao;
import com.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeedao;
	
	@Override
	public void save(Employee employee) {
		employeedao.save(employee);
		
	}

	@Override
	public void updateByID(Employee employee) {
		employeedao.updateByID(employee);
		
	}

	@Override
	public Employee getByid(Integer integer) {
		
		return employeedao.getByid(integer);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employeedao.getAll();
	}

	
	
}
