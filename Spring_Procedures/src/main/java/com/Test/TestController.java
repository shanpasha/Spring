package com.Test;

import java.util.List;

import org.slf4j.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.Controller.EmployeeController;
import com.Dao.EmployeeDAO;
import com.Dao.EmployeeDaoImpl;

import com.bean.Employee;
import com.springConfig.SpringConfigaration;


 
public class TestController {
private static Logger log=org.slf4j.LoggerFactory.getLogger(TestController.class);
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfigaration.class); 
		
//		EmployeeController employee=(EmployeeController) applicationContext.getBean("employeeController");
//	
//		System.out.println(employee.FindAll());
		  
		EmployeeDAO dao=(EmployeeDAO) applicationContext.getBean("employeeJDBCTemplateDaoImpl");
		
		
		System.out.println(dao.Callpro(20, 20));
		
	}

}
