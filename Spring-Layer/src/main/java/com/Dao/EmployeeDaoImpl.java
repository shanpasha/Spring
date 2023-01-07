package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDAO {

	DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

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
		
		
		
		
		
		//For checking connection
		
//		try {
//			System.out.println("Employee Dao save method called" + dataSource.getConnection());
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
	}

//	public static void main(String[] args) throws SQLException {
//
//		ApplicationContext Context = new ClassPathXmlApplicationContext("spring.xml");
//		BasicDataSource m = (BasicDataSource) Context.getBean("dataSource1");
//		System.out.println(m.getConnection());
//
//	}

}
