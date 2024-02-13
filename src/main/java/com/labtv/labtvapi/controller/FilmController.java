package com.labtv.labtvapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import com.labtv.labtvapi.model.Film;
import com.labtv.labtvapi.service.FilmService;

@RestController
@RequestMapping("/api/films")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping("/titoli/{text}")
    public List<Film> searchFilms(@PathVariable("text") String text) {
        return filmService.searchFilmsByTitle(text);
    }

    @GetMapping("/{id}")
    public Optional<Film> getFilmDetails(@PathVariable String id) {
        return filmService.findFilmById(id);
    }
}
