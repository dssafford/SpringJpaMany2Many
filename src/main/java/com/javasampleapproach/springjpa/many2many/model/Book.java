package com.javasampleapproach.springjpa.many2many.model;

import javax.persistence.*;

/**
 * Created by Doug on 2/19/17.
 */
@Entity
public class Book{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;

	@ManyToOne
	@JoinColumn(name = "book_category_id")
	private BookCategory bookCategory;

	public Book() {

	}

	public Book(String name) {
		this.name = name;
	}

	public Book(String name, BookCategory bookCategory) {
		this.name = name;
		this.bookCategory = bookCategory;
	}


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


	public BookCategory getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}
}