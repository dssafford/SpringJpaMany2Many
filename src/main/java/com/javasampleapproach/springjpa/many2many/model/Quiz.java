package com.javasampleapproach.springjpa.many2many.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

/**
 * Created by Doug on 2/14/17.
 */

@Entity
public class Quiz {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String comments;
	private BigDecimal finalScore;

	@ManyToOne
	@JoinColumn(name = "score_id")
	private Score score;

	@ManyToMany(mappedBy = "quizzes")
	private Set<Location> locations;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public BigDecimal getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(BigDecimal finalScore) {
		this.finalScore = finalScore;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public Set<Location> getLocations() {
		return locations;
	}

	public void setLocations(Set<Location> locations) {
		this.locations = locations;
	}

	public Quiz() {
	}

	public Quiz(String comments) {
		this.comments = comments;
	}

	public Quiz(BigDecimal finalScore, String comments) {
		this.comments = comments;
		this.finalScore = finalScore;
	}
}
