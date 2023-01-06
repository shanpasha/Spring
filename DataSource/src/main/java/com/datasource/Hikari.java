package com.datasource;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariDataSource;

public class Hikari {
	public static void main(String[] args) {
		
		
		HikariDataSource hikari =new HikariDataSource();
		 
		hikari.setDriverClassName("com.mysql.cj.jdbc.Driver");
		hikari.setJdbcUrl("jdbc:mysql://localhost/hibernate");
		hikari.setUsername("root");
		hikari.setPassword("shan");
		
		Connection connection=null;
		
		
		try {
			connection=hikari.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(connection);
		
	}

}
