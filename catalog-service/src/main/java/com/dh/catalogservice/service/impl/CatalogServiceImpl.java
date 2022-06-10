package com.dh.catalogservice.service.impl;

import com.dh.catalogservice.dto.GenreDTO;
import com.dh.catalogservice.dto.MovieDTO;
import com.dh.catalogservice.service.CatalogService;
import com.dh.catalogservice.service.MovieFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {
    @Autowired
    private MovieFeign movie;


    @Override
    public GenreDTO findByGenre(String genre) {
        List<MovieDTO>movies= movie.findMovie(genre);
        return new GenreDTO(genre,movies);
    }


}
