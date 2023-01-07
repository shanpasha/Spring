package com.Test;

import java.util.List;

import org.slf4j.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.Controller.EmployeeController;
import com.Dao.EmployeeDaoImpl;
import com.Dao.EmployeeTemplateDaoImpl;
import com.bean.Employee;


 
public class TestController {
private static Logger log=org.slf4j.LoggerFactory.getLogger(TestController.class);
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeController employee=(EmployeeController) applicationContext.getBean("employeeController");
		
//		Employee empl=new Employee(17, "sri", 65000, "sri@gmail.com");
//			
//		employee.updateByID(empl);
//		log.info("employee{}",employee);
		
//	System.out.println(employee.FindByID(6));
		
		employee.FindAll().forEach(System.out::println);
		  
		
	}

}
