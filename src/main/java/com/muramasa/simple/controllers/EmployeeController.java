package com.muramasa.simple.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.muramasa.simple.models.Employee;
import com.muramasa.simple.services.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employees;

	@GetMapping("")
	public String index(Model model) {
		List<Employee> list = employees.findAll();
		
		model.addAttribute("employees", list);
		
		return "/employee/index";
	}
	
	@GetMapping("/{id}")
	public String detail(Model model, @PathVariable Long id) {
		Employee employee = employees.findOne(id);
		
		model.addAttribute("employee", employee);
		
		return "/employee/detail";
	}
	
}
