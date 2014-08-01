package com.cinema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created on 24.07.14.
 */
@Controller
public class Main {

    @RequestMapping({"/", "/home"})
    public ModelAndView showHome() {
        return new ModelAndView("hello");
    }

    @RequestMapping({"app"})
    public String showApp() {
        return "app";
    }

    @RequestMapping({"second"})
    public String showSecond() {
        return "second";
    }
}
