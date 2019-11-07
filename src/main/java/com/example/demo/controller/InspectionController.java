package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Inspection;
import com.example.demo.repo.InspectionRepo;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

@RestController
public class InspectionController {

	@Autowired
	private InspectionRepo repo;
	
	@GetMapping("/inspections")
	public List<Inspection> findAll(@RequestParam("page") int page){
		return repo.findByResult("Violation Issued", PageRequest.of(page, 10));
	}
	
	@GetMapping("/inspections/{city}/{page}")
	public List<Inspection> findByCity(@PathVariable String city, @PathVariable("page") int page){
		return repo.findByAddressCity(city,  PageRequest.of(page, 10));
	}
	
}
