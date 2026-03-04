package com.fdmgroup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.fdmgroup.model.Coach;

public interface CoachRepository extends JpaRepository<Coach, Long>{

}
