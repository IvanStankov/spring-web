package com.ivan.jmp.springweb.controller;

import com.ivan.jmp.springweb.entity.Movie;
import com.ivan.jmp.springweb.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Иван on 17.04.2016.
 */
@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping("/movie/{id}")
    public ModelAndView getMovie(@PathVariable Long id) {
        return new ModelAndView("movie", "movie", movieService.getMovie(id));
    }

    @RequestMapping(value = "/create-movie", method = RequestMethod.GET)
    public String getCreateMoviePage() {
        return "create-movie";
    }

    @RequestMapping(value = "/create-movie", method = RequestMethod.POST)
    public ModelAndView saveMovie(String name, String description, String imageUrl) {
        Movie movie = movieService.createMovie(name, description, imageUrl);
        return new ModelAndView("movie", "movie", movie);
    }

}
