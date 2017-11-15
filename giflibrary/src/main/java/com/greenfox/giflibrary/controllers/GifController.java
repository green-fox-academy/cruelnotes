package com.greenfox.giflibrary.controllers;

import com.greenfox.giflibrary.models.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
public class GifController {

    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping("/gif")
    public String gifDetails() {
        Gif gef = new Gif("error", LocalDate.of(2017,3,17), "Adam Suki", true );
        return "gif-details";
    }
}
