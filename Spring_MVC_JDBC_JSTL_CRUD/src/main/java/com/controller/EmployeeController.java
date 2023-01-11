package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Service.EmployeeService;
import com.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService es;

	@RequestMapping({ "/", "home" })
	public String home() {
		return "Home";
	}

	@RequestMapping("/addEmp")
	public String addEmp() {
		return "addEmp";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Employee employee) {
		es.save(employee);
		return "redirect:/getAllEmployees";
	}

	@RequestMapping("/getAllEmployees")
	public ModelAndView findAll() {

		return new ModelAndView("GetAllEmp", "getEmps", es.findAll());
	}

	@RequestMapping("/updateEmp")
	public String getByid(@RequestParam("id") Integer id, Model model) {
		Employee em = es.getByID(id);

		model.addAttribute("emp", em);
		return "UpdateEmp";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Employee employee) {
		es.update(employee);
		return "redirect:/getAllEmployees";

	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("id") Integer id) {
		es.deleteById(id);
		return "redirect:/getAllEmployees";

	}
}
