package com.greenfox.springstart.controllers;

import com.greenfox.springstart.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRESTController {

    @RequestMapping(value = "/restgreeting{content}",method = RequestMethod.GET)
    @ResponseBody
    public Greeting greeting(@RequestParam("content") String content){
        Greeting gre = new Greeting(1, content);
        return gre;

    }

}
