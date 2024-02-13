package com.labtv.labtvapi.service;

import com.labtv.labtvapi.dao.TrailerDao;
import com.labtv.labtvapi.model.Trailer;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@Service
public class TrailerServiceImpl implements TrailerService {

	@Autowired
	private TrailerDao trailerDao;

	@Override
    public Optional<Trailer> findTrailerByFilmId(String id_film) {
        return trailerDao.findByFilmId(id_film);
    }

}
