package com.javasampleapproach.springjpa.many2many.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Doug on 2/19/17.
 */
@Entity
@Table(name = "back_category")
public class BackCategory {
	private int id;
	private String name;
	private Set<Back> backs;

	public BackCategory(){

	}

	public BackCategory(String name) {
		this.name = name;
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

	@OneToMany(mappedBy = "backCategory", cascade = CascadeType.ALL)
	public Set<Back> getBacks() {
		return backs;
	}

	public void setBacks(Set<Back> backs) {
		this.backs = backs;
	}

//	@Override
//	public String toString() {
//		String result = String.format(
//				  "Category[id=%d, name='%s']%n",
//				  id, name);
//		if (books != null) {
//			for(Book book : books) {
//				result += String.format(
//						  "Book[id=%d, name='%s']%n",
//						  book.getId(), book.getName());
//			}
//		}
//
//		return result;
//	}
}