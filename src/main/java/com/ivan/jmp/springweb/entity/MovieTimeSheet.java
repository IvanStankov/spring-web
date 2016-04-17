package com.ivan.jmp.springweb.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Иван on 13.04.2016.
 */
@Entity
public class MovieTimeSheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    private Movie movie;
    private LocalDateTime startTime;
    private BigDecimal price;
    @OneToMany(mappedBy = "movieTimeSheet", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MovieSession> movieSessionList;

    public MovieTimeSheet() {
    }

    public MovieTimeSheet(Movie movie, LocalDateTime startTime, BigDecimal price) {
        this.movie = movie;
        this.startTime = startTime;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<MovieSession> getMovieSessionList() {
        return movieSessionList;
    }

    public void setMovieSessionList(List<MovieSession> movieSessionList) {
        this.movieSessionList = movieSessionList;
    }
}
