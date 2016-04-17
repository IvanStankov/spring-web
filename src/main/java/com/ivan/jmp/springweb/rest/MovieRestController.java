package com.ivan.jmp.springweb.rest;

import com.ivan.jmp.springweb.entity.Movie;
import com.ivan.jmp.springweb.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Иван on 17.04.2016.
 */
@RestController
public class MovieRestController {

    @Autowired
    private MovieService movieService;

    @RequestMapping(value = "/searchMovie", method = RequestMethod.GET)
    public List<Movie> getMovies(String q) {
        return movieService.getMovies("%" + q + "%");
    }

}
