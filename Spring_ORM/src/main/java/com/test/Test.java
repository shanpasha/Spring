package com.test;

import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.SpringConfig;
import com.controller.Controller;
import com.model.Employee;


public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("Spring.xml");
		Controller con=	(Controller) ap.getBean("con");
	
	
	Employee employee=new Employee(4, "sriman", 65000, "sriman@gmail.com");
//	Employee employee=new Employee(4, "shannu", 46000, "shann@gmail.com");
//	con.updateByID(employee);
		
		
//		ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfig.class);
//		Controller con=	(Controller) ac.getBean("con");
	//con.save(employee);
	con.gSon(con.getByid(1),"empl222.json");
		
		
	}

}
