package com.dh.movieservice.service;

import com.dh.movieservice.model.Movie;

import java.util.List;

public interface MovieService {
   List<Movie> getMoviesByGenre(String genre);

    Movie save(Movie movie);


}
