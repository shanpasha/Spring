package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.Controller.EmployeeController;
import com.bean.Employee;

public class TestController {
	
	public static void main(String[] args) {
		
	ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring.xml");
	
	EmployeeController controller= (EmployeeController) applicationContext.getBean("empl");
			
			Employee employee=new Employee(1,"shan",25000,"shan@gmail.com");
	controller.save(employee);
		
		
		
		
	}
	

}
