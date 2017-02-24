package com.javasampleapproach.springjpa.many2many.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Doug on 2/19/17.
 */
@Entity
@Table(name = "location")
public class LocationOld {
	private int id;
	private String name;
	private Set<QuizOld> quizzes;

	public LocationOld(){

	}

	public LocationOld(String name) {
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

	@OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
	public Set<QuizOld> getQuizzes() {

		return quizzes;
	}

	public void setQuizzes(Set<QuizOld> quizzes) {

		this.quizzes = quizzes;
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