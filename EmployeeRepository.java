package com.bebela.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.bebela.demo.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}
