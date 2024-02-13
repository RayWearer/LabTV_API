package com.labtv.labtvapi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.labtv.labtvapi.model.Film;

public interface FilmDao extends CrudRepository<Film, String>{

	@Query("SELECT f FROM Film f WHERE lower(f.title) LIKE lower(concat('%', :title, '%'))")
	List<Film> findByTitle(@Param("title") String title);

}
