package com.labtv.labtvapi.model;

import jakarta.persistence.*;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "film")
public class Film {

	@Id
    @Column(name = "id")
    private String id;

	@Column(name = "image")
    private String image;

	@Column(name = "title")
    private String title;

	@Column(name = "plot")
    private String plot;

	@OneToMany(mappedBy = "film", fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	@JsonManagedReference
    private List<Star> stars;

    @OneToMany(mappedBy = "film", fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JsonManagedReference
    private List<Director> directors;

    @OneToMany(mappedBy = "film", fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JsonManagedReference
    private List<Genre> genres;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "similar",
        joinColumns = @JoinColumn(name = "film_id"),
        inverseJoinColumns = @JoinColumn(name = "similar_film_id")
    )
    private List<Film> similarFilms;

    @OneToOne(mappedBy = "film", fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    private Trailer trailer;

    public String getId() {
		return id;
	}

	public void ListId(String id) {
		this.id = id;
	}

    public String getImage() {
		return image;
	}

	public void ListImage(String image) {
		this.image = image;
	}

    public String getTitle() {
		return title;
	}

	public void ListTitle(String title) {
		this.title = title;
	}

	public String getPlot() {
		return plot;
	}

	public void ListPlot(String plot) {
		this.plot = plot;
	}

	public List<Star> getStars() {
	    return stars;
	}

	public void ListStars(List<Star> stars) {
	    this.stars = stars;
	}

	public List<Director> getDirectors() {
	    return directors;
	}

	public void ListDirectors(List<Director> directors) {
	    this.directors = directors;
	}

	public List<Genre> getGenres() {
	    return genres;
	}

	public void ListGenres(List<Genre> genres) {
	    this.genres = genres;
	}

	public List<Film> getSimilarFilms() {
        return similarFilms;
    }

    public void ListSimilarFilms(List<Film> similarFilms) {
        this.similarFilms = similarFilms;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    public void ListTrailer(Trailer trailer) {
        this.trailer = trailer;
    }

}
