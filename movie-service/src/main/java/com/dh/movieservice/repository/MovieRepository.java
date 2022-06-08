package com.dh.movieservice.repository;

import com.dh.movieservice.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    public List<Movie> getMoviesByGenre(String genre);
}
