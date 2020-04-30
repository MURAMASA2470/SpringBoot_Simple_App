package com.muramasa.simple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.muramasa.simple.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


	
}
