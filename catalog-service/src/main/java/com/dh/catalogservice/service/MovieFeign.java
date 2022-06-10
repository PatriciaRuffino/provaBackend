package com.dh.catalogservice.service;


import com.dh.catalogservice.dto.MovieDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "movie")
public interface MovieFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/movies/{genre}")
    List<MovieDTO> findMovie(@PathVariable(value = "genre") String genre);


}
