package com.dh.movieservice.service.impl;

import com.dh.movieservice.model.Movie;
import com.dh.movieservice.repository.MovieRepository;
import com.dh.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository repository;

    @Autowired
    public MovieServiceImpl(MovieRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Movie> getMoviesByGenre(String genre) {
        return repository.getMoviesByGenre(genre);
    }

    @Override
    public Movie save(Movie movie) {
        return repository.save(movie);
    }


}
