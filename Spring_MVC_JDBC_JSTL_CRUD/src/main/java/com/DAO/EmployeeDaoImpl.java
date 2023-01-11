package com.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	JdbcTemplate  jd;

	@Override
	public void save(Employee employee) {
		jd.update("insert into employee values(?,?,?,?)",
				employee.getId(),employee.getName(),employee.getSalary(),employee.getEmail());
		
	}

	@Override
	public List<Employee> findAll() {
		
		return jd.query("select*from employee", new BeanPropertyRowMapper(Employee.class));
	}

	@Override
	public Employee getById(Integer id) {
		return	 jd.queryForObject("select*from employee where id=?",
				new BeanPropertyRowMapper<Employee>(Employee.class),	new Object[] {id});
		
		
	}
	@Override
	public void update(Employee employee) {
		jd.update("update employee set name=? ,salary=?, email=? where id=?", 
				employee.getName(),employee.getSalary(),employee.getEmail(),employee.getId());
		
	}

	@Override
	public void deleteById(Integer id) {
		jd.update("delete from  employee where id=?",id);
		
	}

	
//	public static void main(String[] args) {
//		ApplicationContext ap=new ClassPathXmlApplicationContext("spr.xml");
//		EmployeeDaoImpl d=(EmployeeDaoImpl) ap.getBean("employeeDaoImpl");
//		Employee employee=new Employee(1, "shannu", 50000, "shannu@gmail.com");
//		d.update(employee);
//	}

	
}
