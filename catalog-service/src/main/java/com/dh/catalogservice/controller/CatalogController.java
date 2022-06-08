package com.dh.catalogservice.controller;

import com.dh.catalogservice.model.Catalog;
import com.dh.catalogservice.service.CatalogService;
import com.dh.catalogservice.service.MovieFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
    @Autowired
    private CatalogService service;

    @Autowired
    private MovieFeign movie;

    @GetMapping("/{genre}")
    public List<Catalog> getMoviesByGenre(@PathVariable String movie){

        return (List<Catalog>) service.findByGenre(movie);
    }

}




