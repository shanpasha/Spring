package com.Json;

import java.util.List;

import com.model.Employee;

public interface Json {
	public void GsonList(List<Employee> list, String location);
	public void  gSon(Employee emp, String location);
}
