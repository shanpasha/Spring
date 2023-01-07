package com.TestBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;

public class EmployeeTest {
	
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
		
		Employee  employee=(Employee) ap.getBean("employee");
		System.out.println(employee);
		
	
	}

}
 