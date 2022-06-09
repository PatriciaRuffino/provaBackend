package com.dh.catalogservice.service.impl;

import com.dh.catalogservice.service.CatalogService;
import com.dh.catalogservice.service.MovieFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl implements CatalogService {
    @Autowired
    private MovieFeign movie;


    @Override
    public String findByGenre(String genre) {
        return movie.findMovie(genre);
    }


}
