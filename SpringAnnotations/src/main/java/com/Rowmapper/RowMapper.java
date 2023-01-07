package com.Rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.bean.Employee;

public class RowMapper implements org.springframework.jdbc.core.RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
	Employee employee=new Employee();
	employee.setId(rs.getInt("id"));
	employee.setName(rs.getString("name"));
	employee.setSalary(rs.getDouble("salary"));
	employee.setEmail(rs.getString("email"));
	
		return employee;
	}
	
	

}
