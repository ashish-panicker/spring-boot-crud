package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;

public class CascadingMongoEventListener extends AbstractMongoEventListener<Object>{
	
	@Autowired
    private MongoOperations mongoOperations;
	
	
}
