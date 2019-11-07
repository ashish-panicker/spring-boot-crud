package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;
import com.example.demo.repo.ProjectRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository emprepo;
	
	@Autowired
	private ProjectRepository prjRepo;
	
	@PostMapping("/employees")
	public void create(@RequestBody Employee emp) {
		prjRepo.saveAll(emp.getProjects());
		emprepo.save(emp);
		
	}
	
	@GetMapping("/employees")
	public List<Employee> findAll(){
		
		return emprepo.findAll();
		
	}
	
	@GetMapping("/employees/{email}")
	public Employee findOne(@PathVariable String email){
		
		return emprepo.findByEmail(email);
		
	}
	

}
