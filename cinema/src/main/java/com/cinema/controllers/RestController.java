package com.cinema.controllers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * Created on 31.07.14.
 */
@Controller
@RequestMapping("/api")
public class RestController {

    @RequestMapping(value = "/quotes/{id}", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String getQuotes(@PathVariable Integer id) {
        try {
            Document document = Jsoup.connect("http://bash.im/quote/" + id).get();
            Elements element = document.select("div.text");
            String parsedText = element.text();
            return parsedText;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}
