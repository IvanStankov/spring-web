package com.ivan.jmp.springweb.rest;

import com.ivan.jmp.springweb.service.MovieTimeSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Иван on 17.04.2016.
 */
@RestController
public class TimeSheetRestController {

    @Autowired
    private MovieTimeSheetService movieTimeSheetService;

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public void setSpotBooked(int spotNum, Long timeSheetId, boolean booked) {
        movieTimeSheetService.setBooked(spotNum, timeSheetId, booked);
    }

}
