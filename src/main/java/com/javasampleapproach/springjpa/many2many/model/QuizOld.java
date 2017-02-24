package com.javasampleapproach.springjpa.many2many.model;

import javax.persistence.*;

/**
 * Created by Doug on 2/19/17.
 */
@Entity
public class QuizOld {
	private int id;
	private String name;
	private LocationOld location;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public QuizOld() {

	}

	public QuizOld(String name) {
		this.name = name;
	}

	public QuizOld(String name, LocationOld location) {
		this.name = name;
		this.location = location;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}





















	@ManyToOne
	@JoinColumn(name = "location_id")
	public LocationOld getLocation() {
		return location;
	}

	public void setLocation(LocationOld location) {
		this.location = location;
	}
}