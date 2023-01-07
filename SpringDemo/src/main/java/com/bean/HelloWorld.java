package com.bean;

public class HelloWorld {
	
	String name;
	
	
	
	
//public void setName(String name) {
//		this.name = name;
//	}




public HelloWorld(String name) {
	super();
	this.name = name;
}




public void Welocome(){
		
	System.out.println(name+"Welcome to Spring Framework");
		
	}




@Override
public String toString() {
	return "HelloWorld [name=" + name + "]";
}
	
	
	
	

}
