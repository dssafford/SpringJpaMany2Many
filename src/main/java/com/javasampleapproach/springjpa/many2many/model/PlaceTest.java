package com.javasampleapproach.springjpa.many2many.model;

import javax.persistence.*;

/**
 * Created by Doug on 2/25/17.
 */
@Entity
public class PlaceTest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

//	@ManyToOne
//	@JoinColumn(name = "place_id")
//	private Place place;

	@OneToOne
	private Place place;

	private Integer placeNumber;
	private String placeName;
	private String answerPlaceName;
	private Boolean answerIsCorrect;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public Integer getPlaceNumber() {
		return placeNumber;
	}

	public void setPlaceNumber(Integer placeNumber) {
		this.placeNumber = placeNumber;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getAnswerPlaceName() {
		return answerPlaceName;
	}

	public void setAnswerPlaceName(String answerPlaceName) {
		this.answerPlaceName = answerPlaceName;
	}

	public Boolean getAnswerIsCorrect() {
		return answerIsCorrect;
	}

	public void setAnswerIsCorrect(Boolean answerIsCorrect) {
		this.answerIsCorrect = answerIsCorrect;
	}

	public PlaceTest(){}
	public PlaceTest(Integer placeNumber, String placeName, String answerPlaceName,
						  Boolean answerIsCorrect){
		this.placeNumber=placeNumber;
		this.placeName=placeName;
		this.answerPlaceName=answerPlaceName;
		this.answerIsCorrect=answerIsCorrect;
	}
	public PlaceTest(String placeName, Place place){
		this.placeName = placeName;
		this.place=place;
	}


}
