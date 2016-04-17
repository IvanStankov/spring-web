package com.ivan.jmp.springweb.controller;

import com.ivan.jmp.springweb.service.MovieService;
import com.ivan.jmp.springweb.service.MovieTimeSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Иван on 14.04.2016.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private MovieTimeSheetService movieTimeSheetService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView renderHomePage() {
        return new ModelAndView("movies", "moviesTimeSheet", movieTimeSheetService.getCurrent());
    }

}
