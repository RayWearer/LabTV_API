package com.labtv.labtvapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "evidenza")
public class Evidenza {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "rank")
    private Double rank;

    @Column(name = "rankUpDown")
    private Double rankUpDown;

    @Column(name = "title")
    private String title;

    @Column(name = "fullTitle")
    private String fullTitle;

    @Column(name = "year")
    private Double year;

    @Column(name = "image")
    private String image;

    @Column(name = "crew")
    private String crew;

    @Column(name = "imDbRating")
    private String imDbRating;

    @Column(name = "imDbRatingCount")
    private String imDbRatingCount;

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getRank() {
		return rank;
	}

	public void setRank(Double rank) {
		this.rank = rank;
	}

	public Double getRankUpDown() {
		return rankUpDown;
	}

	public void setRankUpDown(Double rankUpDown) {
		this.rankUpDown = rankUpDown;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFullTitle() {
		return fullTitle;
	}

	public void setFullTitle(String fullTitle) {
		this.fullTitle = fullTitle;
	}

	public Double getYear() {
		return year;
	}

	public void setYear(Double year) {
		this.year = year;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCrew() {
		return crew;
	}

	public void setCrew(String crew) {
		this.crew = crew;
	}

	public String getImDbRating() {
		return imDbRating;
	}

	public void setImDbRating(String imDbRating) {
		this.imDbRating = imDbRating;
	}

	public String getImDbRatingCount() {
		return imDbRatingCount;
	}

	public void setImDbRatingCount(String imDbRatingCount) {
		this.imDbRatingCount = imDbRatingCount;
	}

}
