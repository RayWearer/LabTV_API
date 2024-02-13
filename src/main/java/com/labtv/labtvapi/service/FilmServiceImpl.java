package com.labtv.labtvapi.service;

import com.labtv.labtvapi.dao.FilmDao;
import com.labtv.labtvapi.model.Film;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmDao filmDao;
	
	@Override
    public List<Film> getFilms() {
        return (List<Film>) filmDao.findAll();
    }

    @Override
    public Optional<Film> findFilmById(String id) {
        return filmDao.findById(id);
    }

    @Override
    public List<Film> searchFilmsByTitle(String title) {
        return filmDao.findByTitle(title);
    }

}
