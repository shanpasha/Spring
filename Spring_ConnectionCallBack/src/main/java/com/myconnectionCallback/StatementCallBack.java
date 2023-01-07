package com.myconnectionCallback;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.StatementCallback;

import com.bean.Employee;

public class StatementCallBack implements StatementCallback<Employee> {
	private String name;

	public Employee doInStatement(Statement stmt) throws SQLException, DataAccessException {
		
        		ResultSet rs=stmt.executeQuery("select*from employee where name="+name);
        		
        		if(rs.next()) {
        			
        			
        			
        		}
        		
        	return null;
	}

}
