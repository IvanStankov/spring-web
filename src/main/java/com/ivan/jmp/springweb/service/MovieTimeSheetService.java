package com.ivan.jmp.springweb.service;

import com.ivan.jmp.springweb.entity.MovieTimeSheet;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Иван on 16.04.2016.
 */
public interface MovieTimeSheetService {

    List<MovieTimeSheet> getCurrent();

    void createTimeSheet(Long movieId, BigDecimal price, LocalDateTime startTime);

    MovieTimeSheet getTimeSheet(Long timeSheetId);

    void setBooked(int num, Long timeSheetId, boolean booked);

}
