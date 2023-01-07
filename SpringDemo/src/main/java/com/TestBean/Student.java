package com.TestBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
	int sId;
	String sName;
	String sFee;
	
	
	



	
	
	public void setsId(int sId) {
		this.sId = sId;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public void setsFee(String sFee) {
		this.sFee = sFee;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sFee=" + sFee + "]";
	}
	public static void main(String[] args) {
		
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("studentbean.xml");
		
	Student student=	(Student) applicationContext.getBean("student");
		
		
		System.out.println(student);
		
	}
	
	

}
