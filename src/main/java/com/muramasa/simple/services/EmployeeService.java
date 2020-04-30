package com.muramasa.simple.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muramasa.simple.repositories.EmployeeRepository;
import com.muramasa.simple.models.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepos;

	public List<Employee> findAll() {
		return empRepos.findAll();
	}
	
	public Employee findOne(Long id) {
		return empRepos.findById(id).orElseGet(null);
	}

}
