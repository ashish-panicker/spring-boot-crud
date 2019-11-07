package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>{

	Employee findByEmail(String email);
	
	
}
