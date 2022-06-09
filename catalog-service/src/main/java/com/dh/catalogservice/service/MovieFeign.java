package com.dh.catalogservice.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "movie")
public interface MovieFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/movie/{genre}")
    String findMovie(@PathVariable(value = "genre") String genre);


}
