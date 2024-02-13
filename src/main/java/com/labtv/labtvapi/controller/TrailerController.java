package com.labtv.labtvapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import com.labtv.labtvapi.model.Trailer;
import com.labtv.labtvapi.service.TrailerService;

@RestController
@RequestMapping("/api/trailers")
public class TrailerController {

    @Autowired
    private TrailerService trailerService;

    @GetMapping("/{film_id}")
    public Optional<Trailer> getTrailerByFilmId(@PathVariable String film_id) {
        return trailerService.findTrailerByFilmId(film_id);
    }
}
