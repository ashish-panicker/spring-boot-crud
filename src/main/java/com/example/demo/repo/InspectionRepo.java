package com.example.demo.repo;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Inspection;

public interface InspectionRepo extends MongoRepository<Inspection, String> {
	
	List<Inspection> findByResult(String result, Pageable page);
	
	List<Inspection> findByAddressCity(@Param("address.city") String city, Pageable page);

}
