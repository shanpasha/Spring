package com.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bean.Employee;
import com.myconnectionCallback.MyConnectionCallBack;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public Employee FindById(Integer id) {
		
		return jdbcTemplate.execute(new MyConnectionCallBack(id));
	}

	public List<Employee> getAllEmps() {
		
		return jdbcTemplate.query("select*from employee", new BeanPropertyRowMapper(Employee.class));
	}

}
