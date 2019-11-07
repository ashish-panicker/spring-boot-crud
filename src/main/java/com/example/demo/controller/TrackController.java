package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Track;
import com.example.demo.repo.TrackRepo;

@RestController
public class TrackController {
	
	@Autowired
	private TrackRepo trackRepo;
	
	@PostMapping("/tracks")
	public Track create(@RequestBody Track track) {
		trackRepo.insert(track);
		return track;
	}
	
	@PutMapping("/employees/{id}")
	public Track update(@PathVariable String id, @RequestBody Track track) {
		track.setId(id);
		trackRepo.save(track);
		return track;
	}
	
	@GetMapping("/tracks")
	public List<Track> findAll(){
		return trackRepo.findAll();
	}

}
