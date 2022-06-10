package com.dh.catalogservice.controller;


import com.dh.catalogservice.dto.GenreDTO;
import com.dh.catalogservice.dto.MovieDTO;
import com.dh.catalogservice.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
    @Autowired
    private CatalogService service;


    @GetMapping("/{genre}")
    public ResponseEntity <GenreDTO> findMovie(@PathVariable String genre){
        return ResponseEntity.ok().body(service.findByGenre(genre)) ;
    }

}




