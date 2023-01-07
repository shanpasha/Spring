package com.test;

import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.SpringConfig;

import com.controller.EmpController;
import com.model.Employee;


public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ap=new AnnotationConfigApplicationContext(SpringConfig.class);
		EmpController con=	(EmpController) ap.getBean("con");
	System.out.println(con.getAll());
	

	
		
		
	}

}
