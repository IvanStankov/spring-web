package com.ivan.jmp.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Created by Иван on 20.04.2016.
 */
@Controller
public class HeadersController {

    @RequestMapping(value = "/headers", method = RequestMethod.GET)
    public String getHeadersPage() {
        return "headers";
    }

    @RequestMapping(value = "/header-color", method = RequestMethod.GET)
    @ResponseBody
    public String redirectToColorPage(@RequestHeader("color") String color) {
        return "green".equals(color) ? "green-circle" : "red-circle";
    }
}
