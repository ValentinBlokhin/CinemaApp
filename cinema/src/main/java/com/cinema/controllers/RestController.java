package com.cinema.controllers;

import com.cinema.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.Iterator;

/**
 * Created on 31.07.14.
 */
@Controller
@RequestMapping("/api")
public class RestController {

    @Autowired
    private RestService restService;

    @RequestMapping(value = "/quotes/{id}", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String getQuotes(@PathVariable Integer id) {

        return restService.getQuotes(id);

    }

    @RequestMapping(value = "/quotes/new", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String getNews() {
        return restService.getNews();
    }
}
