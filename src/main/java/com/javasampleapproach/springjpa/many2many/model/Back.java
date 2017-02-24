package com.javasampleapproach.springjpa.many2many.model;

import javax.persistence.*;

/**
 * Created by Doug on 2/19/17.
 */
@Entity
public class Back {
	private int id;
	private String name;
	private BackCategory backCategory;

	public Back() {

	}

	public Back(String name) {
		this.name = name;
	}

	public Back(String name, BackCategory backCategory) {
		this.name = name;
		this.backCategory = backCategory;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToOne
	@JoinColumn(name = "back_category_id")
	public BackCategory getBackCategory() {
		return backCategory;
	}

	public void setBackCategory(BackCategory backCategory) {
		this.backCategory = backCategory;
	}
}