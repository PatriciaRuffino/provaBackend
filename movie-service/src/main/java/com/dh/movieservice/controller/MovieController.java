package com.dh.movieservice.controller;

import com.dh.movieservice.model.Movie;
import com.dh.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService service;

    @Autowired
    public MovieController(MovieService service){
        this.service = service;
    }

    //Save Movie
    @PostMapping
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
        return ResponseEntity.ok().body(service.save(movie));
    }

    //List Movies by genre
    @GetMapping("/{genre}")
    public List<Movie> getMoviesByGenre(@PathVariable String genre){
        return service.getMoviesByGenre(genre);
    }

}
