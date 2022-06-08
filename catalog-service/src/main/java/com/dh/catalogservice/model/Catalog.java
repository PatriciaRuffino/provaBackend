package com.dh.catalogservice.model;

import lombok.Data;

import java.util.List;

@Data
public class Catalog {
    private List<Movie> movies;
}
