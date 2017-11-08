package com.spring.optional.controllers;


import com.spring.optional.models.ErrorMessage;
import com.spring.optional.models.Groot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @GetMapping(value="/groot")
    public Object iAmGroot (@RequestParam ("message") String message) {
        if (message.equals("")) {
            ErrorMessage error = new ErrorMessage("I am Groot!");
            return error;
        } else {
            Groot babyGroot = new Groot(message);
            return babyGroot;
        }
    }
}
