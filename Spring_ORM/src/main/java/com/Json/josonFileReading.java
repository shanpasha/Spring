package com.Json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class josonFileReading{
	public static void main(String[] args) {
		 JSONParser parser = new JSONParser();
	    
	         Object obj;
			try {
				obj = parser.parse(new FileReader("employee.json"));
				 JSONObject jsonObject = (JSONObject)obj;
		         int id = (int) jsonObject.get("id");
		         String name = (String)jsonObject.get("name");
		         double salary = (double) jsonObject.get("salary");
		         String email=(String) jsonObject.get("email");
		         System.out.println("Name: " + name);
		         System.out.println("Course: " + salary);
		         System.out.println("salary:"+salary);
		         System.out.println("email:"+email);
				
		       //  JSONArray array = new JSONArray();
		   //      array.add(obj);
		         
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	         
	        
	}
	

}
