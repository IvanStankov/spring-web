package com.ivan.jmp.springweb.repository;

import com.ivan.jmp.springweb.entity.MovieTimeSheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Иван on 16.04.2016.
 */
@Repository
public interface MovieTimeSheetRepository extends JpaRepository<MovieTimeSheet, Long> {

    List<MovieTimeSheet> findByStartTimeGreaterThanOrderByMovieIdAscStartTimeAsc(LocalDateTime startTime);

}
