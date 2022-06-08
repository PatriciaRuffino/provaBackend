package com.dh.catalogservice.service;

import com.dh.catalogservice.model.Catalog;
import com.dh.catalogservice.model.Movie;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CatalogService {


    ResponseEntity<Movie> findByGenre(String genre);


}
