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

	// 全件取得
	public List<Employee> findAll() {
		return this.empRepos.findAll();
	}
	
	// 1件取得
	public Employee findOne(Long id) {
		return this.empRepos.findById(id).orElseGet(null);
	}
	
	// INSERT
	public Employee save(Employee employee) {
		return this.empRepos.save(employee);
	}
	
	// DELETE
	public void delete(Long id) {
		this.empRepos.deleteById(id);
	}
	
	// SELECT COUNT(*)
	public Long count() {
		return this.empRepos.count();
	}

}
