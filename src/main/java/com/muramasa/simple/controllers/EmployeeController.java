package com.muramasa.simple.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/{id}/edit")
	public String edit(Model model, @PathVariable Long id) {
		Employee employee = employees.findOne(id);
		model.addAttribute("employee", employee);
		return "/employee/edit";
	}
	
	@GetMapping("/create")
	public String create(Model model) {
		return "/employee/create";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute Employee employee) {
		this.employees.save(employee);
		return "redirect:/employees";
	}
	
	@PutMapping("/update/{id}")
	public String update(@ModelAttribute Employee employee, @PathVariable Long id) {
		employee.setId(id);
		this.employees.save(employee);
		return "redirect:/employees/"+id;
	}
	
	public String delete(@PathVariable Long id) {
		this.employees.delete(id);
		return "redirect:employees";
	}
	
}
