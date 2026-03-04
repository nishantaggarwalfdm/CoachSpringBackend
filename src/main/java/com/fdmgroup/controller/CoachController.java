package com.fdmgroup.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fdmgroup.model.Coach;
import com.fdmgroup.service.CoachServiceInterface;

@RestController
@RequestMapping("api/v1/coach")
//@CrossOrigin(origins = "https://coach-frontend-419807603191.northamerica-northeast1.run.app")
public class CoachController {
	CoachServiceInterface service;

	@Autowired
	public CoachController(CoachServiceInterface service) {
		super();
		this.service = service;
	}
	
//	@RequestMapping(method = RequestMethod.GET)
	@GetMapping
	public List<Coach> getAllCoaches(){
		System.out.println("get all request");
		List<Coach> returnedCoaches=service.getAllCoaches();
		return returnedCoaches;
		//service.getAllcoaches();
	}
	
	@GetMapping("/{id}")
	Coach getCoach(@PathVariable Long id) {
		Coach returnedCoach=service.getCoach(id);
		return returnedCoach;
	}
	
	@PostMapping
	ResponseEntity<Coach> createCoach(@RequestBody Coach coach) {
		System.out.println("received coach from postman:"+coach);
		Coach newlyCreatedCoach=service.addCoach(coach);
		//localhost808/api/v1/coach/101
		URI newLoaction=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newlyCreatedCoach.getId()).toUri();
		return ResponseEntity.created(newLoaction).body(newlyCreatedCoach);
	}

}
