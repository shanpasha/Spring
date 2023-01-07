package com.Dao;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import com.bean.Employee;



@Repository
public class EmployeeJDBCTemplateDaoImpl implements EmployeeDAO {
	private static Logger log=LoggerFactory.getLogger(EmployeeJDBCTemplateDaoImpl.class);
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	

	@Override
	public void save(Employee employee) {
		jdbcTemplate.update("insert into employee values (?,?,?,?) ", new Object[] {employee.getId(),
				employee.getName(),employee.getSalary(),employee.getEmail()});
		
		
	}

	@Override
	public void updateByID(Employee employee) {
		jdbcTemplate.update("update employee set name=?,salary=?,email=? where id=? ",
				new Object [] {employee.getName(),employee.getSalary(),employee.getEmail(),employee.getId() });
		
	}

	@Override
	public List<Employee> FindAll() {
		
		                       /// by impl
		//return jdbcTemplate.query("Select*from employee",new RowMapper());
		
		                     ///Annomous Type
//		return jdbcTemplate.query("Select*from Employee", new org.springframework.jdbc.core.RowMapper <Employee >() {
//
//			@Override
//			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Employee employee=new Employee();
//				employee.setId(rs.getInt("ID"));
//				employee.setName(rs.getString("Name"));
//				employee.setSalary(rs.getDouble("salary"));
//				employee.setEmail(rs.getString("email"));
//                return employee ;
//			}
//		});
		log.info("Before start Method");
			List<Employee>em=jdbcTemplate.query("Select*from employee", new BeanPropertyRowMapper(Employee.class));
			log.debug("list{}",em);
		return em;
		
		
	}

	@Override
	public Employee FindByID(Integer id) {
		return 
		 jdbcTemplate.queryForObject("select*from employee where id=?",new BeanPropertyRowMapper<>(Employee.class),new Object[] {id});
	}

	
		
		
		
		
		
	
}
