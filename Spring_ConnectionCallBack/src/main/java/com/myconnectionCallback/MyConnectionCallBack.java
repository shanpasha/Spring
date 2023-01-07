package com.myconnectionCallback;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ConnectionCallback;

import com.bean.Employee;

public class MyConnectionCallBack implements ConnectionCallback<Employee>{

	private int id;
	
	
	
	
	


	public MyConnectionCallBack(int id) {
		super();
		this.id = id;
	}

	
	
	

	public Employee doInConnection(Connection con) throws SQLException, DataAccessException {
	PreparedStatement ps=con.prepareStatement("select*from employee where id=?");
		
	ps.setInt(1, id);
	ResultSet rs=ps.executeQuery();
	
	if(rs.next()) {
		Employee em=new Employee();
		em.setId(rs.getInt("id"));
		em.setName(rs.getString("name"));
		em.setSalary(rs.getDouble("salary"));
		em.setEmail(rs.getString("email"));
		
		
		return em;
		
	}
	
	
		return null;
	}

}
