package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.EmployeeDao;
import com.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	EmployeeDao em;
	
	@Override
	public void save(Employee employee) {
		
	em.save(employee);
		
	}

	@Override
	public List<Employee> findAll() {
		
		return em.findAll();
	}

	@Override
	public Employee getByID(Integer id) {
		
		return em.getById(id);
	}

	@Override
	public void update(Employee employee) {
		em.update(employee);
		
	}

	@Override
	public void deleteById(Integer id) {
		em.deleteById(id);
		
	}

}
