package com.TestBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.HelloWorld;

public class TestHelloWorld {
	
	public static void main(String[] args) {  
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
		
		HelloWorld helloWorld=(HelloWorld) ap.getBean("hello");
		System.out.println(helloWorld);
		helloWorld.Welocome();
		
	}

}
