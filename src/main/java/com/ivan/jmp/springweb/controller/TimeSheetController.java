package com.ivan.jmp.springweb.controller;

import com.ivan.jmp.springweb.entity.MovieTimeSheet;
import com.ivan.jmp.springweb.service.MovieService;
import com.ivan.jmp.springweb.service.MovieTimeSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Created by Иван on 17.04.2016.
 */
@Controller
public class TimeSheetController {

    @Autowired
    private MovieTimeSheetService movieTimeSheetService;
    @Autowired
    private MovieService movieService;

    @RequestMapping(value = "/create-time-sheet", method = RequestMethod.GET)
    public ModelAndView getTimeSheetPage() {
        return new ModelAndView("create-time-sheet", "movies", movieService.getMovies());
    }

    @RequestMapping(value = "/create-time-sheet", method = RequestMethod.POST)
    public String createTimeSheet(Long movieId, BigDecimal price,
                                  @DateTimeFormat(pattern = "dd.MM.yyyy HH:mm") @RequestParam LocalDateTime startTime) {
        movieTimeSheetService.createTimeSheet(movieId, price, startTime);
        return "redirect:/";
    }

    @RequestMapping(value = "/create-booking/{timeSheetId}", method = RequestMethod.GET)
    public ModelAndView getBookingPage(@PathVariable Long timeSheetId) {
        MovieTimeSheet timeSheet = movieTimeSheetService.getTimeSheet(timeSheetId);
        return new ModelAndView("create-booking", "timeSheet", timeSheet);
    }

}
