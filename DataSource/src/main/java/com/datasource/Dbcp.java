package com.datasource;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;


public class Dbcp {
	public static void main(String[] args) {
		
		BasicDataSource source=new BasicDataSource();
		source.setUrl("jdbc:mysql://localhost:3306/hibernate");
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUsername("root");
		source.setPassword("shan");
		
		
		Connection connection=null;
		try {
			 connection=source.getConnection();
			 
			 
		} catch (SQLException e) {
			
		}
		
		System.out.println(connection);
	}

}
