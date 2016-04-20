package com.ivan.jmp.springweb.service.impl;

import com.ivan.jmp.springweb.entity.MovieSession;
import com.ivan.jmp.springweb.entity.MovieTimeSheet;
import com.ivan.jmp.springweb.repository.MovieRepository;
import com.ivan.jmp.springweb.repository.MovieSessionRepository;
import com.ivan.jmp.springweb.repository.MovieTimeSheetRepository;
import com.ivan.jmp.springweb.service.MovieTimeSheetService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Иван on 16.04.2016.
 */
@Service
@Transactional
public class MovieTimeSheetServiceImpl implements MovieTimeSheetService, InitializingBean {

    @Autowired
    private MovieTimeSheetRepository movieTimeSheetRepository;
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private MovieSessionRepository movieSessionRepository;

    @Override
    public List<MovieTimeSheet> getCurrent() {
        return movieTimeSheetRepository.findByStartTimeGreaterThanOrderByMovieIdAscStartTimeAsc(LocalDateTime.now());
    }

    @Override
    @Async
    public void createTimeSheet(Long movieId, BigDecimal price, LocalDateTime startTime) {
        movieTimeSheetRepository.save(new MovieTimeSheet(movieRepository.getOne(movieId), startTime, price));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // do nothing
        }
    }

    @Override
    public MovieTimeSheet getTimeSheet(Long timeSheetId) {
        return movieTimeSheetRepository.findOne(timeSheetId);
    }

    @Override
    public void setBooked(int num, Long timeSheetId, boolean booked) {
        MovieTimeSheet timeSheet = movieTimeSheetRepository.findOne(timeSheetId);
        if (booked) {
            timeSheet.getMovieSessionList().add(new MovieSession(timeSheet, num));
        } else {
            MovieSession movieSession = movieSessionRepository.findByMovieTimeSheetIdAndSpot(timeSheetId, num);
            timeSheet.getMovieSessionList().remove(movieSession);
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("The bean movieTimeSheetService has been created");
    }
}
