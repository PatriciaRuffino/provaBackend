package com.dh.catalogservice.service.impl;

import com.dh.catalogservice.model.Catalog;
import com.dh.catalogservice.model.Movie;
import com.dh.catalogservice.service.CatalogService;
import com.dh.catalogservice.service.MovieFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {
    @Autowired
    private MovieFeign movie;

    @Autowired
    private CatalogService service;



    @Override
    public ResponseEntity<Movie> findByGenre(String genre) {
        var catalog = service.findByGenre(genre);
        return movie.findMovie(catalog.getBody().getGenre());
    }


}
