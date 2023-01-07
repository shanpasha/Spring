package com.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Config.SpringConfig;
import com.Controller.EmpController;

public class EmpTest {
public static void main(String[] args) {
	
	
	
	ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfig.class);
	
	EmpController emp= (EmpController) ac.getBean("empController");
	
	System.out.println(emp.getAllEmps());

	
	
	
	
}
}
