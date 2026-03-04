package com.fdmgroup.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fdmgroup.exception.CoachNotFoundException;
import com.fdmgroup.model.Coach;
import com.fdmgroup.repository.CoachRepository;

@Service
public class CoachService implements CoachServiceInterface {
	
	CoachRepository repo;

	public CoachService(CoachRepository repo) {
		super();
		this.repo = repo;
	}
	
	public Coach addCoach(Coach coach) {
		
		return repo.save(coach);
	}

	@Override
	public List<Coach> getAllCoaches() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Coach getCoach(Long id) {
		
		return repo.findById(id).orElseThrow(()->  new CoachNotFoundException("no coach found with id :"+ id));
				
	}

}
