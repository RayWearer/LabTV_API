package com.labtv.labtvapi.service;

import java.util.Optional;

import com.labtv.labtvapi.model.Trailer;

public interface TrailerService {

	Optional<Trailer> findTrailerByFilmId(String id_film);

}
