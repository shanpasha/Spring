package com.Json;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.controller.Controller;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.model.Employee;
@Component
public class JosonFormatImpl implements Json {
	@Override
	public void GsonList(List<Employee> list, String location) {
		Gson gson = new Gson();
		try {
			PrintWriter file = new PrintWriter(location);
			for (Object obj : list) {
				gson.toJson(obj, file.append("\n"));
			}
			file.flush();
			file.close();
			System.out.println("success");
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void gSon(Employee emp, String location) {
		Gson gson = new Gson();
		try {
			FileWriter file = new FileWriter(location);

			gson.toJson(emp, file);

			file.flush();
			file.close();
			System.out.println("success");
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	
	

	

	

}
