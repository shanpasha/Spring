package com.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Employee;

@Repository
@Transactional

public class EmployeeDaoImpl implements EmployeeDao

{

	
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	

	@Override
	public void save(Employee employee) {
		
		 hibernateTemplate.save(employee);
	}


	@Override
	public void updateByID(Employee employee) {
		
		hibernateTemplate.update(employee);
		
	}


	@Override
	public Employee getByid(Integer integer) {
		
		return hibernateTemplate.get(Employee.class, integer);
	}


	@Override
	public List<Employee> getAll() {
		
		return hibernateTemplate.loadAll(Employee.class);
	}

}
