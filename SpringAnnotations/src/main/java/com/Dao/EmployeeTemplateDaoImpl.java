package com.Dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.bean.Employee;
import com.myOwnTemplate.MyTemplate;
@Repository

public class EmployeeTemplateDaoImpl implements EmployeeDAO {
	
@Autowired
	MyTemplate myTemplate;

	@Override
	public void save(Employee employee) {
		myTemplate.update("insert into employee values (?,?,?,?) ", new Object[] {employee.getId(),
				employee.getName(),employee.getSalary(),employee.getEmail()});
		
		
	}

	@Override
	public void updateByID(Employee employee) {
		myTemplate.update("update employee set name=? salary=? location=? where id=? ", new Object[] {
				employee.getName(),employee.getSalary(),employee.getEmail(),employee.getId()});
		
		
	}

	@Override
	public List<Employee> FindAll() {
	
		List<Employee> em=myTemplate.Findall("select*from employee");
		
		return em;
		
	}
		
	

	@Override
	public Employee FindByID(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
		
		
		
	
}
