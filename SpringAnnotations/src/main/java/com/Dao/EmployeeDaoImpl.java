package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bean.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDAO {

	@Autowired
	DataSource dataSource;

	@Override
	public void save(Employee employee) {
		Connection connection=null;
		PreparedStatement ps=null;
		try {
			 connection=dataSource.getConnection();
			
			ps=connection.prepareStatement("insert into employee values (?,?,?,?)");
			
			
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setString(4, employee.getEmail());
			ps.setDouble(3, employee.getSalary());
			ps.executeUpdate();
			
			System.out.println("Succes");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally{
			
			try {
				connection.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}

	@Override
	public void updateByID(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> FindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee FindByID(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
		
		
		
		
		
	
}
