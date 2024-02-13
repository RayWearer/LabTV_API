package com.labtv.labtvapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "trailer")
public class Trailer {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

	@Column(name = "video_url")
	private String video_url;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "film_id")
	private Film film;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

    public String getVideoUrl() {
		return video_url;
	}

	public void setVideoUrl(String video_url) {
		this.video_url = video_url;
	}

}
