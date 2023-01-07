package com.procedureAndFunctions;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

public class AddandMultiProcedure  extends StoredProcedure {



	public AddandMultiProcedure(JdbcTemplate jdbcTemplate, String name) {
		super(jdbcTemplate, name);
		
		
		declareParameter(new SqlParameter("num1",Types.INTEGER));
		declareParameter(new SqlParameter("num2",Types.INTEGER));
		declareParameter(new SqlOutParameter("result",Types.INTEGER));
		declareParameter(new SqlOutParameter("result2",Types.INTEGER));
		compile();
	}
	
	public Map<String, Integer> execu(int num1,int num2){
		Map<String, Integer> resultmap=new HashMap<String, Integer>();
		
		Map<String, Object> out =super.execute(num1,num2);
		resultmap.put("ADD", (Integer) out.get("result"));
		resultmap.put("mul", (Integer) out.get("result2"));
		return resultmap;
	}
	
	

}
