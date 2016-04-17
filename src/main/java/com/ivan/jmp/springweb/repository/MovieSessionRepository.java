package com.ivan.jmp.springweb.repository;

import com.ivan.jmp.springweb.entity.MovieSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Иван on 17.04.2016.
 */
@Repository
public interface MovieSessionRepository extends JpaRepository<MovieSession, Long> {

    MovieSession findByMovieTimeSheetIdAndSpot(Long timeSheetId, int spot);

}
