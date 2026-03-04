package com.fdmgroup.service;

import java.util.List;

import com.fdmgroup.model.Coach;

public interface CoachServiceInterface {

	public Coach addCoach(Coach coach);

	public List<Coach> getAllCoaches();

	public Coach getCoach(Long id);
}
