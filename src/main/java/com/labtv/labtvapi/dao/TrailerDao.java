package com.labtv.labtvapi.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.labtv.labtvapi.model.Trailer;

public interface TrailerDao extends CrudRepository<Trailer, Integer>{

	@Query("SELECT t FROM Trailer t WHERE t.film.id = :film_id")
    Optional<Trailer> findByFilmId(@Param("film_id") String filmId);

}
