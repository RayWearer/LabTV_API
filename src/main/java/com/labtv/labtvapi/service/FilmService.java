package com.labtv.labtvapi.service;

import java.util.List;
import java.util.Optional;

import com.labtv.labtvapi.model.Film;

public interface FilmService {

	List<Film> getFilms();

    Optional<Film> findFilmById(String id);
    
    List<Film> searchFilmsByTitle(String title);

}
