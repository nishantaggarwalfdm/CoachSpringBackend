package com.fdmgroup.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "COACH_TABLE")
public class Coach {
	
	@Id
	@SequenceGenerator(name = "coach_seq_gen", sequenceName = "coach_seq", initialValue = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="coach_seq_gen" )
	Long id;
	String name;
	public Coach(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Coach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + "]";
	}
	
}
	
	
	
	