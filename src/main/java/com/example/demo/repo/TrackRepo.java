package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Track;

public interface TrackRepo extends MongoRepository<Track, String>{

}
