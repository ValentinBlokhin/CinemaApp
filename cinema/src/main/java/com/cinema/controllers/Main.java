package com.cinema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created on 24.07.14.
 */
@Controller
public class Main {

    @RequestMapping({"/home"})
    public String showHome() {
        return "hello";
    }
}
