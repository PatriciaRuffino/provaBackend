package com.dh.catalogservice.dto;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GenreDTO {
    private String name;
    private List<MovieDTO> movies;

}
