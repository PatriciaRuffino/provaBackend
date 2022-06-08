package com.dh.catalogservice.model;



import lombok.Data;

import javax.persistence.*;

@Data

public class Movie {

    private Long id;
    private String name;
    private String genre;
    private String urlStream;
}