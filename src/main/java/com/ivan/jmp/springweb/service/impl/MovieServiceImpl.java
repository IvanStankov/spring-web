package com.ivan.jmp.springweb.service.impl;

import com.ivan.jmp.springweb.entity.Movie;
import com.ivan.jmp.springweb.repository.MovieRepository;
import com.ivan.jmp.springweb.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Иван on 13.04.2016.
 */
@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie createMovie(String name, String description, String url) {
        Movie movie = new Movie(name, description, url);
        movie.setId(1L);
        return movieRepository.saveAndFlush(movie);
    }

    @Override
    public Movie getMovie(Long id) {
        return movieRepository.findOne(id);
    }

    @Override
    public void deleteMovie(Long id) {
        movieRepository.delete(id);
    }

    @Override
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    @Override
    public List<Movie> getMovies(String q) {
        return movieRepository.findByNameLike(q);
    }
}
