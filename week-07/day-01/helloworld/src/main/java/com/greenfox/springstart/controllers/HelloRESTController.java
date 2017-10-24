package com.greenfox.springstart.controllers;

import com.greenfox.springstart.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong counter = new AtomicLong(1);

    @RequestMapping(value = "/restgreeting{content}",method = RequestMethod.GET)
    @ResponseBody
    public Greeting greeting(@RequestParam("content") String content){
        Greeting gre = new Greeting(counter.incrementAndGet(), content);
        return gre;
    }
}
