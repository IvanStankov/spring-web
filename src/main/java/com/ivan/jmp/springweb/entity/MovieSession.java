package com.ivan.jmp.springweb.entity;

import javax.persistence.*;

/**
 * Created by Иван on 13.04.2016.
 */
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "movieTimeSheet_id", "spot"}))
public class MovieSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private MovieTimeSheet movieTimeSheet;
    private int spot;

    public MovieSession() {
    }

    public MovieSession(MovieTimeSheet movieTimeSheet, int spot) {
        this.movieTimeSheet = movieTimeSheet;
        this.spot = spot;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MovieTimeSheet getMovieTimeSheet() {
        return movieTimeSheet;
    }

    public void setMovieTimeSheet(MovieTimeSheet movieTimeSheet) {
        this.movieTimeSheet = movieTimeSheet;
    }

    public int getSpot() {
        return spot;
    }

    public void setSpot(int spot) {
        this.spot = spot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MovieSession that = (MovieSession) o;

        return id.equals(that.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
