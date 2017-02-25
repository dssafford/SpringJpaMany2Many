package com.javasampleapproach.springjpa.many2many.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * Created by Doug on 1/8/17.
 */

@Entity
@Table(name = "score")
public class Score {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Date timestamp;
	private Integer masterListID;
	private Integer answerListID;
	private BigDecimal finalScore;
	private String comments;

	@OneToMany(mappedBy = "score", cascade = CascadeType.ALL)
	private Set<Quiz> quizzes;

	public Score(){}
	public Score(String comments){
		this.comments = comments;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getMasterListID() {
		return masterListID;
	}

	public void setMasterListID(Integer masterListID) {
		this.masterListID = masterListID;
	}

	public Integer getAnswerListID() {
		return answerListID;
	}

	public void setAnswerListID(Integer answerListID) {
		this.answerListID = answerListID;
	}

	public BigDecimal getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(BigDecimal finalScore) {
		this.finalScore = finalScore;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}


	public Set<Quiz> getQuizzes() {
		return quizzes;
	}

	public void setQuizzes(Set<Quiz> quizzes) {
		this.quizzes = quizzes;
	}

}
