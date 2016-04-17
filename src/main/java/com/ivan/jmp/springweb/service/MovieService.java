package com.ivan.jmp.springweb.service;

import com.ivan.jmp.springweb.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Иван on 13.04.2016.
 */
public interface MovieService {

    Movie createMovie(String name, String description, String url);

    Movie getMovie(Long id);

    void deleteMovie(Long id);

    List<Movie> getMovies();

    List<Movie> getMovies(String q);

}
