package com.labtv.labtvapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name="genre")
public class Genre {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column (name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "film_id")
    @JsonBackReference
    private Film film;

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

	public Film getFilm() {
	    return film;
	}

	public void setFilm(Film film) {
	    this.film = film;
	}

}
