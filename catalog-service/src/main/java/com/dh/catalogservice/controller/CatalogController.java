package com.dh.catalogservice.controller;


import com.dh.catalogservice.service.CatalogService;
import com.dh.catalogservice.service.MovieFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
    @Autowired
    private CatalogService service;


    @GetMapping("/{genre}")
    public String findMovie(@PathVariable String genre){
        return service.findByGenre(genre);
    }

}




