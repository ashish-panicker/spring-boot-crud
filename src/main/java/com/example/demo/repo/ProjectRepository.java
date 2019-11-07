package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Project;

public interface ProjectRepository extends MongoRepository<Project, String> {

}
