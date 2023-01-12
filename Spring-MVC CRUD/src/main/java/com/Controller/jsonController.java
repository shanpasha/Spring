package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Service.EmployeeeService;
import com.model.Employee;

@Controller
public class jsonController {
	@Autowired
	EmployeeeService em;
	
	@RequestMapping(value = "empAll/json", produces = "application/json")
	public @ResponseBody List<Employee> findAllJson(){
		
		return em.getAll();
		
		
	}

}
