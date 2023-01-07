package com.myOwnTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bean.Employee;



public class MyTemplate {
Logger log=LoggerFactory.getLogger(MyTemplate.class);
	
	
	

	DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void update(String sql, Object[] objects) {

		Connection connection = null;
		PreparedStatement ps = null;

		try {
			log.info("before connection",connection);
			connection = dataSource.getConnection();
			
			log.info("getting connection",connection);
			
			System.out.println(dataSource.getConnection());
			ps = connection.prepareStatement(sql);

			for (int i = 0; i < objects.length; i++) {
				ps.setObject(i, objects[i]);

			}
			ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();

		}

		finally {
			try {
				connection.close();
				ps.close();
			} catch (SQLException e) {

				e.printStackTrace();

			}

		}
	}

	public <T> List<T>  Findall(String sql) {

		
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		 List<T>  employees = new ArrayList<>();
		try {
			log.info("before connection {}",connection);
			connection = dataSource.getConnection();
			log.info("After connection {}",connection);
			
			log.info("before ps {}",ps);
			ps = connection.prepareStatement(sql);
			log.info("after ps{}",ps);
			rs = ps.executeQuery();
			log.info("rs reslut {}",rs);
			

			while (rs.next()) {
				Employee employee = new Employee();
				
				
				employee.setId(rs.getInt("id"));
				employee.setName(rs.getString("name"));
				employee.setSalary(rs.getDouble("salary"));
				employee.setEmail(rs.getString("email"));
				
			employees.add((T) employee);
				log.info("employee {}",employee);
				
			}

			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		log.info("list {}",employees);
		return employees;

	}

}
