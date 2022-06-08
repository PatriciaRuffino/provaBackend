package com.dh.catalogservice.service;

import com.dh.catalogservice.model.Movie;
import org.apache.commons.configuration.resolver.CatalogResolver;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "movie", path = "/movie")
public interface MovieFeign {

 /*   @RequestMapping(method = RequestMethod.GET, value = "/movie/{genre}")
    String findMovie(@PathVariable(value = "genre") String genre);

  */
    @GetMapping(value = "/{genre}")
    ResponseEntity<Movie> findMovie(@PathVariable String genre);
}
