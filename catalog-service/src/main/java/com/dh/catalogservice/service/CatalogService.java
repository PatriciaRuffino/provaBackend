package com.dh.catalogservice.service;

import com.dh.catalogservice.dto.GenreDTO;
import com.dh.catalogservice.dto.MovieDTO;

import java.util.List;

public interface CatalogService {

    GenreDTO findByGenre(String genre);
}
